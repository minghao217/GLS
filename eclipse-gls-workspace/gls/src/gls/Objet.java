package gls;

public class Objet extends Contenu{
	private int taille;
	
	public Objet(String nom, boolean estVisible, boolean estActif, int taille){
		super(nom,estVisible,estActif);
		this.taille = taille;
	}

}
