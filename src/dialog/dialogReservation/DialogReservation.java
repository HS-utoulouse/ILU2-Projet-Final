package dialog.dialogReservation;

import control.controlReservation.ControlReservation;
import presentation.PresentationJFrameReservationRestaurant;
import java.time.LocalDate;

public abstract class DialogReservation {
    protected PresentationJFrameReservationRestaurant presentationJFrameReservation;
    protected ControlReservation controlReservation;
    protected int jour;
    protected int mois;
    protected int annee;
    protected String heure;

    public DialogReservation(ControlReservation controlResa) {
        this.controlReservation = controlResa;
        this.miseAzero();
    }

    public void miseAzero() {
        jour = 0;
        mois = 0;
        annee = 0;
        heure = null;
    }

    public void handleDateSelectedEvent(LocalDate date) {
        jour = date.getDayOfMonth();
        mois = date.getMonthValue();
        annee = date.getYear();
        System.out.println("Jour choisie : "+jour+"/"+mois+"/"+annee);
        presentationJFrameReservation.enable("heure");
    }

    public void handleHeureSelectedEvent(String valeur) {
        heure = valeur;
                System.out.println("Heure choisie : "+heure);
        presentationJFrameReservation.enable("nombre");
    }

    public void handleAnnulationEvent() {
        this.miseAzero();
                System.out.println("Annulation de la réservation en cours !!!");
        presentationJFrameReservation.dispose();
        System.out.println("========= RESERVATION ANNULER =========");
    }

    public abstract void handleValidationEvent();
}