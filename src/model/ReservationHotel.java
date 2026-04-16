package model;

public class ReservationHotel extends Reservation{
	
	int nbLitsSimples, nbLitsDoubles, nbChambre;
	
	public ReservationHotel(int mois, int jour, int nbLitsSimples, int nbLitsDoubles, int nbChambre) {
		super(mois, jour);
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
		this.nbChambre = nbChambre;
	}
	
	public String toString() {
		return "Le " + jour + "/" + mois + " : chambre n°" + nbChambre + " avec " + nbLitsSimples + " lits simples et " + nbLitsDoubles + " lits doubles.\n";
	}
}
