package gls;

public class Choix {
	private String nom;
	private String texte;
	private boolean condition;
	
	public Choix(String nom, String texte, boolean condition) {
		this.nom = nom;
		this.texte = texte;
		this.condition = condition;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getTexte() {
		return this.texte;
	}
	
	public boolean getCondition() {
		return this.condition;
	}
}
