package gls;

public abstract class Contenu {
	private String nom;
	private boolean estVisivible;
	private boolean estActif;
	
	public Contenu(String nom, boolean estVisible, boolean estActif) {
		this.nom = nom;
		this.estVisivible = estVisible;
		this.estActif= estActif;
		
	}
	public String getNom() {
		return this.nom;
	}
}
