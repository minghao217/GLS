package gls;

import java.util.HashMap;
import java.util.Map;

public class Explorateur {
	
	private Lieu lieuActuel;
	private String nom;
	private int taille;
	Map<Objet,Integer> inventaire = new HashMap<>();
	
	public void add(Objet objet,int numero) {
		if (verifierTaille()){
			this.inventaire.put(objet,numero);
		}
	}
	public Map getInventaire() {
		return this.inventaire;
	}
	//virifier la taille a completer
	private boolean verifierTaille(){
		return true;
	}
	
	public void setLieuActuel(Lieu lieu) {
		this.lieuActuel = lieu;
	}
	
	public Lieu getLieuActuel() {
		return this.lieuActuel;
	}
	
	public Explorateur(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}
}
