package test_fonctionnel;

import model.CarnetReservation;
import model.Client;
import model.reservation.ReservationRestaurant;
import control.controlReservation.ControlReservationRestaurant;
import frontiere.BoundaryReservation;

public class TestReserverTerminal {

	public static void main(String[] args) {
        // 1. Initialisation du modèle
        CarnetReservation<ReservationRestaurant> carnet = new CarnetReservation<>();
        
        // 2. Simulation d'un client connecté (Normalement récupéré après la connexion)
        Client clientFictif = new Client("CHAUDET", "Christelle", "christelle.chaudet@irit.fr", "mdp");

        // 3. Initialisation du contrôleur avec le client
        ControlReservationRestaurant controleur = new ControlReservationRestaurant(carnet, clientFictif);

        // 4. Lancement de la frontière Terminal
        BoundaryReservation frontiere = new BoundaryReservation(controleur);
        frontiere.reserver();
        
     // ---------- CONTROLE DES DONNEES ----------
     		System.out.println("\n\n---------- CONTROLE DES DONNEES ----------");
     		System.out.println(carnet);
    }
}