package control;

import control.controlReservation.ControlReservationRestaurant;
import dialog.DialogMenuConnecter;
import dialog.dialogReservation.DialogReservationRestaurant;
import model.CarnetReservation;
import model.Client;
import model.reservation.Reservation;
import java.time.LocalDate;
import java.util.ArrayList;
import model.reservation.ReservationRestaurant;

public class ControlMenuConnecter {
    private Client client;
    private CarnetReservation<ReservationRestaurant> carnetReservation;

    public ControlMenuConnecter(Client client, CarnetReservation<ReservationRestaurant> carnetReservation) {
        this.client = client;
        this.carnetReservation = carnetReservation;
        this.carnetReservation.afficherDansTerminal();
    }
    
    public Reservation[] getReservationsClient() {
        return carnetReservation.reservationClient(client.getAdresseMail());
    }
    
    //public void lancerModuleReservation(){
    //        ControlReservationRestaurant control = new ControlReservationRestaurant(carnetReservation, client);
    //        DialogReservationRestaurant dialog = new DialogReservationRestaurant(control);
    //        dialog.init(); 
    //    }
    
    public Client getClient() {
        return client;
    }

    public CarnetReservation<ReservationRestaurant> getCarnet() {
        return carnetReservation;
    }
    
    public String[] getTextesReservationsAvenir() {
        Reservation[] toutesLesResas = getReservationsClient();
        ArrayList<String> resasAvenir = new ArrayList<>();
        LocalDate aujourdhui = LocalDate.now();

        for (Reservation res : toutesLesResas) {
            LocalDate dateResa = LocalDate.of(res.getAnnee(), res.getMois(), res.getJour());
            
            if (!dateResa.isBefore(aujourdhui)) {
                resasAvenir.add(res.toString());
            }
        }
        return resasAvenir.toArray(new String[0]);
    }

    public String[] getTextesReservationsPassees() {
        Reservation[] toutesLesResas = getReservationsClient();
        ArrayList<String> resasPassees = new ArrayList<>();
        LocalDate aujourdhui = LocalDate.now();

        for (Reservation r : toutesLesResas) {
            LocalDate dateResa = LocalDate.of(r.getAnnee(), r.getMois(), r.getJour());
            
            if (dateResa.isBefore(aujourdhui)) {
                resasPassees.add(r.toString());
            }
        }
        return resasPassees.toArray(new String[0]);
    }
    
    public String getNomClient(){
        return client.getNom();
    }
    
    public String getPrenomClient(){
        return client.getPrenom();
    }
    
    public String getMailClient(){
        return client.getAdresseMail();
    }
}