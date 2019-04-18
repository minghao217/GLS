package simplepdl.manip;

import java.io.IOException;
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

public class SimplePDLCreator {

	public static void main(String[] args) {
		
		// Charger le package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage packageInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant etre ouverte a
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Creer un objet resourceSetImpl qui contiendra une ressource EMF (le modele)
		ResourceSet resSet = new ResourceSetImpl();

		// Definir la ressource (le modele)
		URI modelURI = URI.createURI("models/model.xmi");
		Resource resource = resSet.createResource(modelURI);
		
		// La fabrique pour fabriquer les elements de SimplePDL
	    SimplepdlFactory myFactory = SimplepdlFactory.eINSTANCE;

		// Creer un element Process
		Process process = myFactory.createProcess();
		process.setName("P1");
		
		// Ajouter le Process dans le modele
		resource.getContents().add(process);

		// Ajouter deux WorkDefinitions
	    WorkDefinition wd1 = myFactory.createWorkDefinition();
	    wd1.setName("Conception");
	    
	    WorkDefinition wd2 = myFactory.createWorkDefinition();
	    wd2.setName("Developpement");
	    
	    WorkDefinition wd3 = myFactory.createWorkDefinition();
	    wd3.setName("RedactionDoc");
	    
	    WorkDefinition wd4 = myFactory.createWorkDefinition();
	    wd4.setName("RedactionTests");
	    
	    process.getProcessElements().add(wd1);
	    process.getProcessElements().add(wd2);
	    process.getProcessElements().add(wd3);
	    process.getProcessElements().add(wd4);
	    
		// Ajouter une WorkSequence entre les deux WorkDefinitions
	    WorkSequence seq = myFactory.createWorkSequence();
	    seq.setPredecessor(wd1);
	    seq.setSuccessor(wd2);
	    seq.setLinkType(WorkSequenceType.FINISH_TO_START);
	    
	    process.getProcessElements().add(seq);
	    
		// Ajouter une deuxieme WorkSequence entre les deux WorkDefinitions
	    WorkSequence seq2 = myFactory.createWorkSequence();
	    seq2.setPredecessor(wd1);
	    seq2.setSuccessor(wd3);
	    seq2.setLinkType(WorkSequenceType.START_TO_START);
	    
	    process.getProcessElements().add(seq2);
	    
	 
	    // Ajouter une deuxieme WorkSequence entre les deux WorkDefinitions
	    WorkSequence seq3 = myFactory.createWorkSequence();
	    seq3.setPredecessor(wd1);
	    seq3.setSuccessor(wd3);
	    seq3.setLinkType(WorkSequenceType.FINISH_TO_FINISH);
	    
	    process.getProcessElements().add(seq3);
	 
	    // Ajouter une deuxieme WorkSequence entre les deux WorkDefinitions
	    WorkSequence seq4 = myFactory.createWorkSequence();
	    seq4.setPredecessor(wd1);
	    seq4.setSuccessor(wd4);
	    seq4.setLinkType(WorkSequenceType.START_TO_START);
	    
	    process.getProcessElements().add(seq4);
		
	    
	    // Ajouter une deuxieme WorkSequence entre les deux WorkDefinitions
	    WorkSequence seq5 = myFactory.createWorkSequence();
	    seq5.setPredecessor(wd2);
	    seq5.setSuccessor(wd4);
	    seq5.setLinkType(WorkSequenceType.FINISH_TO_FINISH);
	    
	    process.getProcessElements().add(seq5);
	    
		// Sauver la ressource
	    try {
	    	resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
