package model;

import java.util.Arrays;
import java.util.Iterator;

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
	
	public T[] reservationClient(String mail) {
		
		T[] tab = (T[]) new Reservation[this.nombreReservation];
		int nombreElement = 0;
		
		for (int i = 0; i < nombreReservation; i++) {
			if (listeReservation[i].getMail().equals(mail)) {
				tab[nombreElement] = listeReservation[i];
				nombreElement++;
			}
		}
		
		return Arrays.copyOf(tab, nombreElement); //généré avec IA évite une double boucle pour avoir un tableau de la bonne taille
	}

	@Override
	public String toString() {
		return "CarnetReservation [listeReservation=" + Arrays.toString(listeReservation) + ", nombreReservation="
				+ nombreReservation + "]";
	}
}