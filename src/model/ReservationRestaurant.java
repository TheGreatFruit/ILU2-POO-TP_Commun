package model;

public class ReservationRestaurant extends Reservation{
	
	int nbService, nbTableReserv;
	
	public ReservationRestaurant(int jour, int mois, int nbService, int nbTableReserv) {
		super(jour, mois);
		this.nbService = nbService;
		this.nbTableReserv = nbTableReserv;
	}

	@Override
	public String toString() {
		if(nbService == 1)
			return "Le " + jour + "/" + mois + " : table n°" + nbTableReserv + " pour le premier service.";
		else {
			return "Le " + jour + "/" + mois + " : table n°" + nbTableReserv + " pour le deuxième service.";
		}
	}

}
