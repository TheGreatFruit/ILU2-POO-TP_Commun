package model;

public class ReservationSpectacle extends Reservation{
	
	int nbZone, nbChaise;
	
	public ReservationSpectacle(int jour, int mois, int nbZone, int nbChaise) {
		super(jour, mois);
		this.nbZone = nbZone;
		this.nbChaise = nbChaise;
	}
	
	@Override
	public String toString() {
			return "Le " + jour + "/" + mois + " : zone n°" + nbZone + " à la chaise n°" + nbChaise + ".";
	}
}
