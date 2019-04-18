package simplepdl.manip;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplepdl.Allocation;
import simplepdl.Process;
import simplepdl.Ressource;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

import petriNet.*;

public class TransformationPetri {

	public static void main(String[] args) {

		// Charger le package SimplePDL afin de l'enregistrer dans le registre
		// d'Eclipse.
		PetriNetPackage packagePetriNet = PetriNetPackage.eINSTANCE;

		// Enregistrer l'extension ".xmi" comme devant etre ouverte a
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Creer un objet resourceSetImpl qui contiendra une ressource EMF (le modele)
		ResourceSet resSet = new ResourceSetImpl();

		// Definir la ressource (le modele)
		URI modelURI = URI.createURI("models/modelPetriParJava.xmi");
		Resource resource = resSet.createResource(modelURI);

		// La fabrique pour fabriquer les elements de SimplePDL
		PetriNetFactory myFactory = PetriNetFactory.eINSTANCE;

		/** LECTURE DU MODELE DE BASE */

		// Chargement du package SimplePDL afin de l'enregistrer dans le registre
		// d'Eclipse.
		SimplepdlPackage packageLecture = SimplepdlPackage.eINSTANCE;

		// Enregistrer l'extension ".xmi" comme devant etre ouverte a 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry regLecture = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> mapLecture = regLecture.getExtensionToFactoryMap();
		mapLecture.put("xmi", new XMIResourceFactoryImpl());

		// Creer un objet resourceSetImpl qui contiendra une ressource EMF (notre
		// modele)
		ResourceSet resSetLecture = new ResourceSetImpl();

		// Charger la ressource (notre modele)
		URI modelURILecture = URI.createURI("models/developpement.xmi");
		Resource resourceLecture = resSetLecture.getResource(modelURILecture, true);

		// Recuperer le premier element du modele (element racine)
		Process process = (Process) resourceLecture.getContents().get(0);

		// Creer un element Process
		PetriNet petriNet = myFactory.createPetriNet();
		petriNet.setName(process.getName());

		// Ajouter le Process dans le modele
		resource.getContents().add(petriNet);

		/**
		 * Manipulation de notre instance
		 */
		// Acceder aux informations du processus charge
		System.out
				.println("Processus : " + process.getName() + " -> Transformation en PetriNet: " + petriNet.getName());

		// Naviguer dans les references
		Integer nbPE = process.getProcessElements().size();
		System.out.println("Nombre de ProcessElement dans " + process.getName() + " : " + nbPE);

		Map<String, ActiviteReseauPetriModule> mapActivites = new HashMap<String, ActiviteReseauPetriModule>();

		// Afficher les sous-activites
		System.out.println("Les sous-activités sont :");
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;

				// Creation de l'enregistrement de l'activité
				ActiviteReseauPetriModule proc = new ActiviteReseauPetriModule(wd, petriNet, myFactory);

				// Ajout des places au Reseau de Petri
				petriNet.getPetrinetelt().add(proc.placeRdy);
				petriNet.getPetrinetelt().add(proc.placeStarted);
				petriNet.getPetrinetelt().add(proc.placeRunning);
				petriNet.getPetrinetelt().add(proc.placeFinished);

				// Ajout des transitions au Reseau de Petri
				petriNet.getPetrinetelt().add(proc.trStart);
				petriNet.getPetrinetelt().add(proc.trFinish);

				// Ajout des arcs au Reseau de Petri
				petriNet.getPetrinetelt().add(proc.arcRdyStart);
				petriNet.getPetrinetelt().add(proc.arcStartStarted);
				petriNet.getPetrinetelt().add(proc.arcStartRunning);
				petriNet.getPetrinetelt().add(proc.arcRunningFinish);
				petriNet.getPetrinetelt().add(proc.arcFinishFinished);

				System.out.println("WD " + wd.getName());
				mapActivites.put(wd.getName(), proc);

			}
		}

		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkSequence) {
				WorkSequence ws = (WorkSequence) o;
				WorkDefinition wd1 = ws.getPredecessor();
				WorkDefinition wd2 = ws.getSuccessor();

				Place pwd1 = null;
				Transition trwd2 = null;

				switch (ws.getLinkType()) {
				case START_TO_START:
					pwd1 = mapActivites.get(wd1.getName()).placeStarted;
					trwd2 = mapActivites.get(wd2.getName()).trStart;
					break;
				case START_TO_FINISH:
					pwd1 = mapActivites.get(wd1.getName()).placeStarted;
					trwd2 = mapActivites.get(wd2.getName()).trFinish;
					break;
				case FINISH_TO_START:
					pwd1 = mapActivites.get(wd1.getName()).placeFinished;
					trwd2 = mapActivites.get(wd2.getName()).trStart;
					break;
				case FINISH_TO_FINISH:
					pwd1 = mapActivites.get(wd1.getName()).placeFinished;
					trwd2 = mapActivites.get(wd2.getName()).trFinish;
					break;

				}

				Arc arc = myFactory.createArc();
				arc.setPoids(1);
				arc.setTypeArc(TypeArc.READ_ARC);
				arc.setNet(petriNet);
				pwd1.getNoeudsSuccesseurs().add(arc);
				trwd2.getNoeudsPredecesseurs().add(arc);

				petriNet.getPetrinetelt().add(arc);
			}
		}

		Map<String, Place> mapRessource = new HashMap<String, Place>();

		for (Object o : process.getProcessElements()) {
			if (o instanceof Ressource) {
				Ressource res = (Ressource) o;

				// Creation d'une place ressource
				Place ressource = myFactory.createPlace();
				ressource.setJeton(res.getCount());
				ressource.setName(res.getName());
				ressource.setNet(petriNet);

				mapRessource.put(res.getName(), ressource);
				petriNet.getPetrinetelt().add(ressource);
			}
		}

		for (Object o : process.getProcessElements()) {
			//System.out.print(o);
			if (o instanceof WorkDefinition) {
				for (Allocation alloca : ((WorkDefinition) o).getAllocation()) {

					// Creation de l'arc de ressource vers la transition start
					Arc arcRessourceToStart = myFactory.createArc();
					arcRessourceToStart.setPoids(alloca.getCount());
					arcRessourceToStart.setTypeArc(TypeArc.ARC_SIMPLE);
					arcRessourceToStart.setPredecesseur(mapRessource.get(alloca.getRessource().getName()));
					arcRessourceToStart.setSuccesseur(mapActivites.get(alloca.getWorkdefinition().getName()).trStart);
					arcRessourceToStart.setNet(petriNet);

					// Creation de l'arc de la transition finish vers ressource
					Arc arcFinishToRessource = myFactory.createArc();
					arcFinishToRessource.setPoids(alloca.getCount());
					arcFinishToRessource.setTypeArc(TypeArc.ARC_SIMPLE);
					arcFinishToRessource.setSuccesseur(mapRessource.get(alloca.getRessource().getName()));
					arcFinishToRessource.setPredecesseur(mapActivites.get(alloca.getWorkdefinition().getName()).trFinish);
					arcFinishToRessource.setNet(petriNet);

					petriNet.getPetrinetelt().add(arcRessourceToStart);
					petriNet.getPetrinetelt().add(arcFinishToRessource);
				}
			}
		}

		// Sauver la ressource
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
