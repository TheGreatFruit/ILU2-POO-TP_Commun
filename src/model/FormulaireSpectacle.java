package model;

public class FormulaireSpectacle extends Formulaire{

	int nbZone;
	
	public FormulaireSpectacle(int jour, int mois, int nbZone) {
		super(jour, mois);
		this.nbZone = nbZone;
	}

	public int getNbZone() {
		return nbZone;
	}
}
