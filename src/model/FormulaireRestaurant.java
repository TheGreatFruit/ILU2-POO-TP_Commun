package model;

public class FormulaireRestaurant extends Formulaire{

	int numService, nombrePersonnes;
	
	public FormulaireRestaurant(int jour, int mois, int nbPersonnes,int numService) {
		super(jour, mois);
		this.numService = numService;
		this.nombrePersonnes = nbPersonnes;
	}

	public int getNombrePersonnes() {
		return nombrePersonnes;
	}

	public int getNumService() {
		return numService;
	}
}
