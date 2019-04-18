package gls;

import java.util.ArrayList;
import java.util.List;

public class Interaction {
	
	private String texte;
	private List<Choix> listeChoix = new ArrayList<Choix>();
	
	public Interaction(String text) {
		this.texte = text;
	}
	
	public void add(Choix choix) {
		this.listeChoix.add(choix);
	}
	public List getListeChoix() {
		return this.listeChoix;
	}
	public String getTexte() {
		return this.texte;
	}
	
}
