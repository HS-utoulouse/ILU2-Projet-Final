package test_fonctionnel;

import control.ControlMenuConnecter;
import dialog.DialogMenuConnecter;
import model.CarnetReservation;
import model.Client;
import model.reservation.ReservationRestaurant;

public class TestMenuConnecterGraphique {

    public static void main(String[] args) {
        
        System.out.println("Lancement du test du Menu Connecté avec données fournies...");

        // 1. Initialisation du carnet générique
        CarnetReservation<ReservationRestaurant> carnet = new CarnetReservation<>();
        
        // 2. Création du client test
        Client clientConnecte = new Client("DUPONT", "Jean", "jean.dupont@email.fr", "mdp123");
       
        // ----------------------------------------------------------------------
        // 3. AJOUT DE RÉSERVATIONS DANS LE FUTUR (Onglet "À Venir")
        // ----------------------------------------------------------------------
        // La réservation initiale
        carnet.ajouterReservation(new ReservationRestaurant(clientConnecte, 1, 1, 2027, "12h30", null, 0, 2, 4));
        // + 3 nouvelles réservations futures
        carnet.ajouterReservation(new ReservationRestaurant(clientConnecte, 14, 7, 2026, "21h00", "Fête nationale", 0, 4, 5));
        carnet.ajouterReservation(new ReservationRestaurant(clientConnecte, 25, 12, 2026, "12h00", "Déjeuner de Noël", 3, 5, 6));
        carnet.ajouterReservation(new ReservationRestaurant(clientConnecte, 15, 5, 2027, "19h45", "Dîner aux chandelles", 0, 2, 3));

        // ----------------------------------------------------------------------
        // 3. AJOUT DE RÉSERVATIONS DANS LE PASSÉ (Onglet "Historique")
        // ----------------------------------------------------------------------
        // La réservation initiale
        carnet.ajouterReservation(new ReservationRestaurant(clientConnecte, 15, 3, 2022, "20h00", "Anniversaire", 2, 4, 6));
        // + 3 nouvelles réservations passées
        carnet.ajouterReservation(new ReservationRestaurant(clientConnecte, 10, 10, 2023, "12h00", "Déjeuner professionnel", 0, 3, 2));
        carnet.ajouterReservation(new ReservationRestaurant(clientConnecte, 5, 12, 2024, "19h30", null, 1, 2, 3));
        carnet.ajouterReservation(new ReservationRestaurant(clientConnecte, 20, 1, 2025, "13h00", "Retrouvailles", 0, 2, 1));

        // 4. Création du Contrôleur
        ControlMenuConnecter control = new ControlMenuConnecter(clientConnecte, carnet);

        // 5. Création du Dialog (Le chef d'orchestre)
        DialogMenuConnecter dialog = new DialogMenuConnecter(control);

        // 6. Lancement de l'interface graphique !
        dialog.init();
        }
}