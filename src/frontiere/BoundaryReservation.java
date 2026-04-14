package frontiere;

import java.util.Scanner;
import control.controlReservation.ControlReservationRestaurant;

public class BoundaryReservation {
	private ControlReservationRestaurant controlResa;
	private Scanner scanner = new Scanner(System.in);

	public BoundaryReservation(ControlReservationRestaurant controlResa) {
		this.controlResa = controlResa;
	}

	public void reserver() {
		System.out.println("=== RÉSERVATION RESTAURANT ===");

		// Saisie de la date (Simule le DatePicker)
		System.out.print("Jour (1-31) : ");
		int jour = scanner.nextInt();
		System.out.print("Mois (1-12) : ");
		int mois = scanner.nextInt();

		// Saisie des personnes (Simule les JComboBox)
		System.out.print("Nombre d'adultes : ");
		int nbAdultes = scanner.nextInt();
		System.out.print("Nombre d'enfants : ");
		int nbEnfants = scanner.nextInt();

		// Saisie de l'heure
		System.out.print("Horaire (ex: 12h30, 19h00) : ");
		String heure = scanner.next();

		// Logique de sélection de table (pour le TP, on peut en demander une au hasard
		// ou laisser le contrôleur gérer, ici on simule l'entrée utilisateur)
		System.out.print("Numéro de table souhaité (1-6) : ");
		int numTable = scanner.nextInt();

		// Appel au contrôleur (Passage de relais)
		boolean succes = controlResa.reserverTable(heure, jour, mois, 2026, null, nbEnfants, nbAdultes, numTable);

		if (succes) {
			System.out.println("Félicitations, votre réservation est enregistrée !");
		} else {
			System.out.println("Désolé, la réservation est impossible (table invalide ou déjà prise).");
		}
	}
}