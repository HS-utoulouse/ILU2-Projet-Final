package control.controlReservation;

import dialog.dialogReservation.DialogReservationRestaurant;
import model.CarnetReservation;
import model.Client;
import model.reservation.ReservationRestaurant;

public class ControlReservationRestaurant extends ControlReservation<ReservationRestaurant> {

	public ControlReservationRestaurant(CarnetReservation<ReservationRestaurant> carnetReservation, Client client) {
		super(carnetReservation, client);
	}

	public boolean reserverTable(String heure, int jour, int mois, int annee, String commentaire, int nombreEnfant,
			int nombreAdultes, int numTable) {
		ReservationRestaurant resa = new ReservationRestaurant(client, jour, mois, annee, heure, commentaire,
				nombreEnfant, nombreAdultes, numTable);

		if (!carnetReservation.estDisponible(resa)) {
			System.out.println("Erreur : La table est déjà prise !");
			return false;
		}
		carnetReservation.ajouterReservation(resa);
		return true;
	}
        
}
