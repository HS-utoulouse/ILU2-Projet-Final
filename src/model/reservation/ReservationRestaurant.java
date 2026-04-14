package model.reservation;

import model.Client;

public class ReservationRestaurant extends Reservation {
	private int nombreEnfant;
	private int nombreAdultes;
	private int numeroTable;

	public ReservationRestaurant(Client client, int jour, int mois, int annee, String heure, String commentaire) {
		super(client, jour, mois, annee, heure, commentaire);
	}

	@Override
	public String toString() {
		return "ReservationRestaurant [nombreEnfant=" + nombreEnfant + ", nombreAdultes=" + nombreAdultes
				+ ", numeroTable=" + numeroTable + ", getDate()=" + getDate() + ", getMail()=" + getMail() + "]";
	}

}
