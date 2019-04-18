package gls;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lieu extends JeuElement{
	private String nom;
	private TypeLieu type;
	private Map<Contenu,Integer> inventaire ;
	private List<Chemin > listeChemin ;
	
	
	public void add(Contenu contenu,int numero) {
		if (verifierTaille()){
			this.inventaire.put(contenu,numero);
		}
	}
	public Map getInventaire(String objet,int numero) {
		return this.inventaire;
	}
	//virifier la taille a completer
	private boolean verifierTaille(){
		return true;
	}
	public Lieu(String nom, TypeLieu type){
		this.nom = nom;
		this.type = type;	
		this.inventaire = new HashMap<>();
		this.listeChemin = new ArrayList<Chemin>();
	}
	
	public String toString(){
		return "Chemin:" + this.nom + TypeLieu.toString(this.type);
	}
	public TypeLieu getType() {
		return this.type;
	}
	
	public List<Chemin> getListeChemin(){
		return this.listeChemin;
	}
	public void addChemin(Chemin e){
		this.listeChemin.add(e);
	}
	
}
