package model;

public class ReservationHotel extends Reservation{
	
	int nbLitsSimples, nbLitsDoubles, nbChambre;
	
	public ReservationHotel(int jour, int mois, int nbLitsSimples, int nbLitsDoubles, int nbChambre) {
		super(jour, mois);
		this.nbLitsSimples = nbLitsSimples;
		this.nbLitsDoubles = nbLitsDoubles;
		this.nbChambre = nbChambre;
	}
	
	public String toString() {
		return "Le " + jour + "/" + mois + " : chambre n°" + nbChambre + " avec " + nbLitsSimples + " lits simples et " + nbLitsDoubles + " lits doubles.";
	}
}
