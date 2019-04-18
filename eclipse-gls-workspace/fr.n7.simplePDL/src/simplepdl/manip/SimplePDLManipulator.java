package simplepdl.manip;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplepdl.Process;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

import petriNet.*;

public class SimplePDLManipulator {

	public static void main(String[] args) {
		
		// Chargement du package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant etre ouverte a 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// CrÃ©er un objet resourceSetImpl qui contiendra une ressource EMF (notre modele)
		ResourceSet resSet = new ResourceSetImpl();

		// Charger la ressource (notre modele)
		URI modelURI = URI.createURI("models/model.xmi");
		Resource resource = resSet.getResource(modelURI, true);
		
		// Recuperer le premier element du modele (element racine)
		Process process = (Process) resource.getContents().get(0);
		
		/**
		 * Manipulation de notre instance
		*/
		// Acceder aux informations du processus charge
	    System.out.println("Processus : " + process.getName());
	    // Naviguer dans les references
	    Integer nbPE = process.getProcessElements().size();
	    System.out.println("Nombre de ProcessElement dans " + process.getName() + " : " + nbPE);

		// Afficher les sous-activites
		System.out.println("Les sous-activités sont :");
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;
				System.out.println("  - " + wd.getName());
			}
		}
	
	    
	}

}
