/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import control.controlReservation.ControlReservation;
import model.CarnetReservation;
import presentation.PresentationJFrameReservation;

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
	private int nombrePersonnes;
	private int numTable;

	public DialogReservation(ControlReservation controlResa) {
		this.controlReservation = controlResa;
	}

	public void init() {
		presentationJFrameReservation = new PresentationJFrameReservation();

	}

}
