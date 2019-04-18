package gls;

public class Personne extends Contenu {
	private Interaction interaction;
	private boolean estObligatoire;
	
	public Personne(String nom, boolean estVisible, boolean estActif, Interaction interaction, boolean estObligatoire) {
		super(nom, estVisible, estActif);
		this.estObligatoire = estObligatoire;
		this.interaction=interaction;
	}
	public Interaction getInteraction() {
		return this.interaction;
	}
	
	public boolean getEstObligatoire() {
		return this.estObligatoire;
	}
	public String getNom() {
		return super.getNom();
	}
}
