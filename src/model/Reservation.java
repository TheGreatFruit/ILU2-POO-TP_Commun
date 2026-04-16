package model;

public abstract class Reservation {
	
	int jour, mois;

	public Reservation(int jour, int mois) {
		this.jour = jour;
		this.mois = mois;
	}
	
}
