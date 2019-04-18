package gls;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Exemple1{
	
	public static void main(String arg[]) {
		
		
		//création du lieu succes
		Lieu succes = new Lieu ("Succes",TypeLieu.FIN);
		
		//création du lieu echec
		Lieu echec = new Lieu ("Echec",TypeLieu.FIN);
		
		//création du lieu enigme
		Lieu enigme = new Lieu ("Enigme",TypeLieu.DEPART);
		
		Chemin chemin_enigme_succes = new Chemin(enigme, succes, true, false, true);
		Chemin chemin_enigme_echec = new Chemin(enigme, echec, true, false, true);
		
		enigme.addChemin(chemin_enigme_echec);
		enigme.addChemin(chemin_enigme_succes);
		
		Interaction InteractionSphinx = new Interaction("Quelle est ma couleur preferée?");
		
		Choix choix1 = new Choix("choix1", "rouge", false);
		Choix choix2 = new Choix("choix2", "bleu", false);
		Choix choix3 = new Choix("choix3", "vert", true);
		
		InteractionSphinx.add(choix1);
		InteractionSphinx.add(choix2);
		InteractionSphinx.add(choix3);
		
		Personne sphinx = new Personne("Sphinx", true, true, InteractionSphinx,true);
		enigme.add(sphinx, 1);
		//fin creation lieu enigme
		
		
		
		
		//creation de l'explorateur
		Explorateur explorateur = new Explorateur("aventurier1", 10);
		Objet tentative = new Objet("Tentative", true, true, 1);
		explorateur.add(tentative, 3);
		explorateur.setLieuActuel(enigme);
		
		
		while(explorateur.getLieuActuel().getType() != TypeLieu.FIN) {
			//actions des personnes obligatoire
			
			
		}
		
		System.out.println("Le jeu est fini!");
		
		
		

		boolean aGagne = false;
		
		while(explorateur.getLieuActuel().getType() != TypeLieu.FIN) {
			while((int) explorateur.getInventaire().get(tentative) > 0 && aGagne == false) {
				//le sphinx pose les question, on les affiche à l'utilisateur
				System.out.println(sphinx.getNom() + ":");
				
				String xxxxxx=sphinx.getInteraction().getTexte();
				System.out.println(xxxxxx);
				
				for(int i =0; i<sphinx.getInteraction().getListeChoix().size();i++) {
					Choix choixAA = (Choix) sphinx.getInteraction().getListeChoix().get(i);
					System.out.println(choixAA.getNom() + ": " + choixAA.getTexte()	);
				}
				
				System.out.println();
				
				//on demande à l'utilisateur quel choix il choisit
				System.out.println("Quel choix voulez-vous?");
				Scanner sc = new Scanner(System.in);
				int index = sc.nextInt();
				List<Choix> listeChoix=sphinx.getInteraction().getListeChoix();
				//on regarde si le choix de l'utilisateur est bon
				Choix choixChoisi = (Choix) sphinx.getInteraction().getListeChoix().get(index-1);
				
				if(choixChoisi.getCondition()) {
					System.out.println("C'est une bonne réponse!");
					//bonne réponse:
					aGagne = true;
					chemin_enigme_succes.setEstVisible(true);
				}
				else {
					System.out.println("C'est une mauvaise réponse!");
					//mauvaise réponse: on enleve un objet tentative
					int x1 = (int) explorateur.getInventaire().get(tentative) -1;
					explorateur.getInventaire().put(tentative, x1);
				}
					
					
			}
			if((int) explorateur.getInventaire().get(tentative)==0) {
				chemin_enigme_echec.setEstVisible(true);
			}
			//Emprunt d'un chemin obligatoire
			
		}
		System.out.println("111111111111111111");

		//Chemin cheminEnigmeSucces = new Chemin(enigme, succes, boolean estOuvert, boolean estVisible)

		
		
	}
}
