package control;

import control.controlReservation.ControlReservationRestaurant;
import dialog.DialogReservation;
import model.CarnetClientele;
import model.CarnetReservation;

public class ControlConnecterClient {
	CarnetClientele carnetClientel;
	CarnetReservation carnetReservation;

	public ControlConnecterClient(CarnetClientele carnetClientel, CarnetReservation carnetReservation) {
		super();
		this.carnetClientel = carnetClientel;
		this.carnetReservation = carnetReservation;
	}

	public int connecterClient(String adresseMail, String mdp) {
		int numClient = carnetClientel.trouverClient(adresseMail);
		if (numClient != -1) {
			boolean mdpOK = carnetClientel.connecterClient(numClient, mdp);
			if (!mdpOK) {
				numClient = -1;
			}
		}
		ControlReservationRestaurant controlResa = new ControlReservationRestaurant(carnetReservation,
				(carnetClientel.getClient(numClient)));

		DialogReservation dialogResa = new DialogReservation(controlResa);
		dialogResa.init();
		return numClient;
	}

}
