package control.controlReservation;

import model.CarnetReservation;
import model.Client;
import model.reservation.Reservation;

public abstract class ControlReservation<T extends Reservation> {
	protected CarnetReservation<T> carnetReservation;
	protected Client client;

	public ControlReservation(CarnetReservation<T> carnetReservation, Client client) {
		this.carnetReservation = carnetReservation;
		this.client = client;
	}

	protected boolean verifierDisponibilite() {
		return carnetReservation.restePlace();
	}
}