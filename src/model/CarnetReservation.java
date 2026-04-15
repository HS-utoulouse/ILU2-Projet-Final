package model;

import java.util.Arrays;

import model.reservation.Reservation;

public class CarnetReservation<T extends Reservation> {
	private T[] listeReservation;
	private int nombreReservation;

	private static final int NOMBRE_RESERVATION_MAX = 100;

	@SuppressWarnings("unchecked")
	public CarnetReservation() {
		this.nombreReservation = 0;
		this.listeReservation = (T[]) new Reservation[NOMBRE_RESERVATION_MAX];
	}

	public boolean restePlace() {
		return nombreReservation < NOMBRE_RESERVATION_MAX;
	}

	public boolean estDisponible(T nouvelleReservation) {
		if (!restePlace()) {
			return false;
		}
		for (int i = 0; i < nombreReservation; i++) {
			if (listeReservation[i].chevauche(nouvelleReservation)) {
				return false;
			}
		}
		return true;
	}

	public void ajouterReservation(T reservation) {
		if (this.estDisponible(reservation)) {
			listeReservation[nombreReservation] = reservation;
			nombreReservation += 1;
		}
                System.out.println("Une réservation a été ajouter au carnet");
	}

	@Override
	public String toString() {
		return "CarnetReservation [listeReservation=" + Arrays.toString(listeReservation) + ", nombreReservation="
				+ nombreReservation + "]";
	}
}