package simplepdl.manip;

import petriNet.Arc;
import petriNet.Noeud;
import petriNet.PetriNet;
import petriNet.PetriNetFactory;
import petriNet.Place;
import petriNet.Transition;
import petriNet.TypeArc;
import simplepdl.WorkDefinition;

/**
 * Enregistrement d'un processus d'un réseau de petri
 * @author mwang
 *
 */
public class ActiviteReseauPetriModule {
	/**
	 * Identifiant
	 */
	private String nomUnique;

	/**
	 * Places du processus
	 */
	Place placeRdy;
	Place placeStarted;
	Place placeRunning;
	Place placeFinished;

	/**
	 * Transitions du processus
	 */
	Transition trStart;
	Transition trFinish;

	/**
	 * Arcs du processus
	 */
	Arc arcRdyStart;
	Arc arcStartStarted;
	Arc arcStartRunning;
	Arc arcRunningFinish;
	Arc arcFinishFinished;

	public ActiviteReseauPetriModule(WorkDefinition wd, PetriNet net, PetriNetFactory myFactory) {
		this.nomUnique = wd.getName();
		
		placeRdy = creerPlace(myFactory, net, wd, "_ready", 1);
		placeStarted = creerPlace(myFactory, net, wd, "_started", 0);
		placeRunning = creerPlace(myFactory, net, wd, "_running", 0);
		placeFinished = creerPlace(myFactory, net, wd, "_finished", 0);

		trStart = creerTransition(myFactory, net, wd, "_start");
		trFinish = creerTransition(myFactory, net, wd, "_finish");

		arcRdyStart = creerArc(myFactory,net, TypeArc.ARC_SIMPLE, 1);
		arcStartStarted = creerArc(myFactory,net, TypeArc.ARC_SIMPLE, 1);
		arcStartRunning = creerArc(myFactory,net, TypeArc.ARC_SIMPLE, 1);
		arcRunningFinish = creerArc(myFactory,net, TypeArc.ARC_SIMPLE, 1);
		arcFinishFinished = creerArc(myFactory,net, TypeArc.ARC_SIMPLE, 1);

		lierArc(placeRdy, trStart, arcRdyStart);
		lierArc(trStart, placeStarted, arcStartStarted);
		lierArc(trStart, placeRunning, arcStartRunning);
		lierArc(placeRunning, trFinish, arcRunningFinish);
		lierArc(trFinish, placeFinished, arcFinishFinished);

	}

	public String getNom() {
		return this.nomUnique;
	}
		
	private static Place creerPlace(PetriNetFactory fact, PetriNet net, WorkDefinition wd, String etat, int nbJetons) {
		Place place = fact.createPlace();
		place.setName(wd.getName() + etat);
		place.setJeton(nbJetons);
		place.setNet(net);
		
		return place;
	}

	private static Arc creerArc(PetriNetFactory fact, PetriNet net,  TypeArc type, int poids) {
		Arc arc = fact.createArc();
		arc.setPoids(poids);
		arc.setTypeArc(type);
		arc.setNet(net);

		return arc;
	}

	private static Transition creerTransition(PetriNetFactory fact, PetriNet net,  WorkDefinition wd, String etat) {
		Transition transition = fact.createTransition();
		transition.setName(wd.getName() + etat);
		transition.setNet(net);
		return transition;

	}

	private static void lierArc(Noeud n1, Noeud n2, Arc arc) {
		n1.getNoeudsSuccesseurs().add(arc);
		n2.getNoeudsPredecesseurs().add(arc);
	}
	/*
	public Place getPlace(String etat) {
		Place p;
		switch (etat) {
		case "_ready":
			p = placeRdy;
			break;
		case "_started":
			p = placeStarted;
			break;
		case "_running":
			p = placeRunning;
			break;
		case "_finished":
			p = placeFinished;
			break;
		default:
			p = null;
			break;
		}
		return p;
	}
	
	public Transition getTransition(String etat) {
		Transition tr;
		switch (etat) {
		case "_start":
			tr = trStart;
			break;
		case "_finish":
			tr = trFinish;
			break;

		default:
			tr = null;
			break;
		}
		return tr;
	}
	
	public Arc getArc(String etat) {
		Transition tr;
		switch (etat) {
		case "_start":
			tr = trStart;
			break;
		case "_finish":
			tr = trFinish;
			break;

		default:
			tr = null;
			break;
		}
		return tr;
	}
	*/

}
