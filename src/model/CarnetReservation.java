package model;

import model.reservation.Reservation;

public class CarnetReservation {
	private Reservation[] listeReservation;
	private int nombreReservation;

	private static final int NOMBRE_RESERVATION_MAX = 100;

	public CarnetReservation() {
		this.nombreReservation = 0;
		this.listeReservation = new Reservation[NOMBRE_RESERVATION_MAX];
	}

	public Boolean retserPlaceListeReservation() {
		return nombreReservation != NOMBRE_RESERVATION_MAX;
	}

	public void ajouterReservation(Reservation reservation) {
		if (this.retserPlaceListeReservation()) {
			listeReservation[nombreReservation] = reservation;
			nombreReservation += 1;
		}
	}

}
