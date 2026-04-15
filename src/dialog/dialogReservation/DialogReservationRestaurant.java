package dialog.dialogReservation;

import control.controlReservation.ControlReservationRestaurant;
import presentation.PresentationJFrameReservationRestaurant;

public class DialogReservationRestaurant extends DialogReservation {
    
    private int nombreEnfant;
    private int nombreAdulte;
    private int numTable;

    public DialogReservationRestaurant(ControlReservationRestaurant controlResa) {
        super(controlResa);
    }
    
    public void init() {
        presentationJFrameReservation = new PresentationJFrameReservationRestaurant();
        presentationJFrameReservation.setDialog(this);
        presentationJFrameReservation.initFrame();
        presentationJFrameReservation.setVisible(true);
        System.out.println("========= RESERVATION TABLE =========");
    }

    @Override
    public void miseAzero() {
        super.miseAzero();
        nombreEnfant = 0;
        nombreAdulte = 0;
        numTable = 0;
    }

    public void handleNumAdulteSelectedEvent(int valeur) {
        nombreAdulte = valeur;
                System.out.println("Nomrbe adultes : "+valeur);
        presentationJFrameReservation.enable("table");
        presentationJFrameReservation.mettreAjourListeTable(nombreAdulte + nombreEnfant);
    }

    public void handleNumEnfantSelectedEvent(int valeur) {
        nombreEnfant = valeur;
                System.out.println("Nombre enfants : "+valeur);
        presentationJFrameReservation.mettreAjourListeTable(nombreAdulte + nombreEnfant);
    }

    public void handleTableSelectedEvent(int valeur) {
        numTable = valeur;
                System.out.println("Table choisie : "+valeur);
    }

    @Override
    public void handleValidationEvent() {
                System.out.println("Réservation en cours de validation :");
        if (jour != 0 && mois != 0 && heure != null && nombreAdulte != 0 && numTable != 0) {
            ControlReservationRestaurant controlResaResto = (ControlReservationRestaurant) controlReservation;
            
            if (controlResaResto.reserverTable(heure, jour, mois, annee, null, nombreEnfant, nombreAdulte, numTable)) {
                System.out.println("\tRéservation reussit");
                presentationJFrameReservation.afficherPopUpConfirmation(
                    "Félicitations ! Votre réservation pour la table " + numTable + 
                    " le " + jour + "/" + mois + " à " + heure + " a bien été enregistrée."
                );
                presentationJFrameReservation.dispose();
                System.out.println("========= RESERVATION TERMINER =========");
            } else {
                System.out.println("\tTable prise !!");
                presentationJFrameReservation.afficherPopUpImpossibleDeValider(
                    "Désolé, la table " + numTable + " est déjà réservée pour ce créneau."
                );
            }
        }else{
            System.out.println("\tInformations manquanets !!");
            presentationJFrameReservation.afficherPopUpImpossibleDeValider(
                "Veuillez remplir toutes les étapes (Date, Heure, Personnes et Table) avant de valider."
            );
        }
    }
}