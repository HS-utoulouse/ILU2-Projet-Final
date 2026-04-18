/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dialog;

import control.ControlMenuConnecter;
import presentation.PresentationJFrameMenuConnecter;
import control.controlReservation.ControlReservationRestaurant;
import model.reservation.ReservationRestaurant;
import dialog.dialogReservation.DialogReservationRestaurant;
import model.Client;
import model.CarnetReservation;
        
public class DialogMenuConnecter {
    
    private ControlMenuConnecter controlMenu;
    private PresentationJFrameMenuConnecter presentationMenu;

    public DialogMenuConnecter(ControlMenuConnecter controlMenu) {
        this.controlMenu = controlMenu;
    }

    public void init() {
        presentationMenu = new PresentationJFrameMenuConnecter();
        presentationMenu.setDialog(this);
        presentationMenu.initFrame();
        
        String[] resasAvenir = controlMenu.getTextesReservationsAvenir();
        String[] resasPassees = controlMenu.getTextesReservationsPassees();
        
        presentationMenu.peuplerListeFutur(resasAvenir);
        presentationMenu.peuplerListePasser(resasPassees);
        presentationMenu.setVisible(true);
    }
    
    public void handleRafraichirEvent() {
        System.out.println("Rafraîchissement des réservations...");
        
        String[] resasAvenir = controlMenu.getTextesReservationsAvenir();
        String[] resasPassees = controlMenu.getTextesReservationsPassees();
        
        presentationMenu.peuplerListeFutur(resasAvenir);
        presentationMenu.peuplerListePasser(resasPassees);
        
        controlMenu.getCarnet().afficherDansTerminal();
    }
    
    public String getNomClient(){
        return controlMenu.getNomClient();
    }
    
    public String getPrenomClient(){
        return controlMenu.getPrenomClient();
    }
    
    public String getMailClient(){
        return controlMenu.getMailClient();
    }
    
    public void lancerModuleReservation() {
        System.out.println("Ouverture du module de réservation...");
        
        // 1. On demande au contrôleur du menu de nous prêter le VRAI carnet et le VRAI client
        Client clientActuel = controlMenu.getClient();
        CarnetReservation<ReservationRestaurant> carnetPartage = controlMenu.getCarnet();
        
        // 2. On les donne au contrôleur de réservation
        ControlReservationRestaurant controlResa = new ControlReservationRestaurant(carnetPartage, clientActuel);
        
        // 3. On lance le nouveau Dialog
        DialogReservationRestaurant dialogResa = new DialogReservationRestaurant(controlResa);
        dialogResa.init(); 
    }
}
