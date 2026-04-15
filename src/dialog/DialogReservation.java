/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import control.controlReservation.ControlReservation;
import presentation.PresentationJFrameReservation;
import java.time.LocalDate;

/**
 *
 * @author hugo
 */
public class DialogReservation {
	private PresentationJFrameReservation presentationJFrameReservation;
	private ControlReservation controlReservation;
	private int jour;
	private int mois;
	private int annee;
	private String heure;
	private int nombreEnfant;
        private int nombreAdulte;
	private int numTable;

	public DialogReservation(ControlReservation controlResa) {
		this.controlReservation = controlResa;
                jour = 0;
                mois = 0;
                annee = 0;
                heure = null;
                nombreEnfant = 0;
                nombreAdulte = 0;
                numTable = 0;
	}

	public void init() {
		presentationJFrameReservation = new PresentationJFrameReservation();
		presentationJFrameReservation.setDialog(this);
		presentationJFrameReservation.initFrame();
		presentationJFrameReservation.setVisible(true);
                System.out.println("======== DEBUT DE LA RESERVATION ========");

	}
        
        public void handleDateSelectedEvent(LocalDate date){
            jour = date.getDayOfMonth();
            mois = date.getMonthValue();
            annee = date.getYear();
            System.out.println("Date choisie : "+jour+"/"+mois+"/"+annee);
            presentationJFrameReservation.enable("heure");
        }
        
        public void handleNumAdulteSelectedEvent(int valeur){
            nombreAdulte = valeur;
            System.out.println("Nombre Adultes : " + valeur);
            presentationJFrameReservation.enable("table");
            presentationJFrameReservation.mettreAjourListeTable(nombreAdulte+nombreEnfant);
        }
        
        public void handleNumEnfantSelectedEvent(int valeur){
            nombreEnfant = valeur;
            System.out.println("Nombre Enfants : " + valeur);
            presentationJFrameReservation.mettreAjourListeTable(nombreAdulte+nombreEnfant);
        }
        
        public void handleHeureSelectedEvent(String valeur){
            heure = valeur;
            System.out.println("Heure choisie : "+ valeur);
            presentationJFrameReservation.enable("nombre");
        }
        
        public void handleTableSelectedEvent(int valeur){
            numTable = valeur;
            System.out.println("Table choisie : "+ valeur);
        }

}
