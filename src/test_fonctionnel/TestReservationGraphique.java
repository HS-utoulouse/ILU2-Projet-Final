package test_fonctionnel;

import control.controlReservation.ControlReservationRestaurant;
import dialog.dialogReservation.DialogReservationRestaurant;
import model.CarnetReservation;
import model.Client;
import model.reservation.ReservationRestaurant;

public class TestReservationGraphique {

    public static void main(String[] args) {
        // 1. Initialiser le Modèle (Les données)
        CarnetReservation<ReservationRestaurant> carnet = new CarnetReservation<>();
        Client clientConnecte = new Client("DUPONT", "Jean", "jean.dupont@email.fr", "mdp123");
        
        // 2. Initialiser le Contrôleur (Le cerveau métier)
        ControlReservationRestaurant control = new ControlReservationRestaurant(carnet, clientConnecte);
        
        // 3. Initialiser le Dialog (Le chef d'orchestre de l'interface)
        DialogReservationRestaurant dialog = new DialogReservationRestaurant(control);
        
        // 4. Lancer l'interface graphique !
        // (Appelle la méthode qui instancie ta PresentationJFrameReservation et la rend visible)
        dialog.init(); 
    }
}