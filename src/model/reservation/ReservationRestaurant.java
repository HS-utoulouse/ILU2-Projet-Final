package model.reservation;

import model.Client;

public class ReservationRestaurant extends Reservation {
	private int nombreEnfant;
	private int nombreAdultes;
	private int numeroTable;

	public ReservationRestaurant(Client client, int jour, int mois, int annee, String heure, String commentaire,
			int nombreEnfant, int nombreAdultes, int numeroTable) {
		super(client, jour, mois, annee, heure, commentaire);
		this.nombreEnfant = nombreEnfant;
		this.nombreAdultes = nombreAdultes;
		this.numeroTable = numeroTable;
	}

	public Boolean sontIdentique(ReservationRestaurant resRes) {
		return memeDate(resRes) && numeroTable == resRes.getNumeroTable();
	}

	public int getNumeroTable() {
		return numeroTable;
	}
	
	@Override
	public boolean chevauche(Reservation autreReservation) {
		if (autreReservation instanceof ReservationRestaurant) {
			ReservationRestaurant autreResRes = (ReservationRestaurant) autreReservation;
			return this.memeDate(autreResRes) && this.numeroTable == autreResRes.getNumeroTable();
		}
		return false;
	}

	@Override
	public String toString() {
		return "ReservationRestaurant [nombreEnfant=" + nombreEnfant + ", nombreAdultes=" + nombreAdultes
				+ ", numeroTable=" + numeroTable + ", getDate()=" + getDate() + ", getMail()=" + getMail() + "]";
	}

}
