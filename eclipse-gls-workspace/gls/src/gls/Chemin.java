package gls;


public class Chemin {
	private Lieu from;
	private Lieu to;
	private boolean estOuvert;
	private boolean estObligatoire;
	private boolean estVisible;
	//recu
	//consume
	
	public Chemin(Lieu from, Lieu to, boolean estOuvert, boolean estVisible, boolean estObligatoire){
		this.to = to;
		this.from = from;
		this.estOuvert = estOuvert;
		this.estVisible = estVisible;
		this.estObligatoire = estObligatoire;
	}
	
	public String toString(){
		String res = "from:" + "\n "+ from.toString() + "\n "+ "to" + "\n "+ to.toString() + "\n ";
		return res;
	}
	
	public void setEstVisible(boolean bool) {
		this.estVisible = bool;
	}
}
