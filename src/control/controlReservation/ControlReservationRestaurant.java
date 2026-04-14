package control.controlReservation;

import model.CarnetReservation;
import model.Client;
import model.reservation.ReservationRestaurant;

public class ControlReservationRestaurant extends ControlReservation<ReservationRestaurant> {

	public ControlReservationRestaurant(CarnetReservation<ReservationRestaurant> carnetReservation, Client client) {
		super(carnetReservation, client);
	}

	public boolean validerTable(int nombrePersonnes, int numTable) {
		boolean estValide = nombrePersonnes >= 1 && (nombrePersonnes <= 2 && numTable == 1)
				|| (nombrePersonnes <= 4 && numTable >= 2 && numTable <= 5) || (nombrePersonnes <= 8 && numTable == 6);

		if (estValide) {
			System.out.println("Réservation VALIDE");
		}
		return estValide;
	}

	public boolean reserverTable(String heure, int jour, int mois, int annee, String commentaire, int nombreEnfant,
			int nombreAdultes, int numTable) {
		ReservationRestaurant resa = new ReservationRestaurant(client, jour, mois, annee, heure, commentaire,
				nombreEnfant, nombreAdultes, numTable);

		if (!validerTable(nombreEnfant + nombreAdultes, numTable)) {
			return false;
		}

		if (!carnetReservation.estDisponible(resa)) {
			System.out.println("Erreur : La table est déjà prise !");
			return false;
		}
		carnetReservation.ajouterReservation(resa);
		return true;
	}
}
