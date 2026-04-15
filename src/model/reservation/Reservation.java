/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.reservation;

import model.Client;

/**
 *
 * @author hugo
 */
public abstract class Reservation {
	private Client client;
	private int jour;
	private int mois;
	private int annee;
	private String heure;
	private String commentaire;

	protected Reservation(Client client, int jour, int mois, int annee, String heure, String commentaire) {
		super();
		this.client = client;
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
		this.heure = heure;
		this.commentaire = commentaire;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getAnnee() {
		return annee;
	}

	public String getDate() {
		return (heure + "/" + jour + "/" + mois + "/" + annee);
	}

	public Boolean memeDate(Reservation res) {
		return this.getDate().equals(res.getDate());
	}

	public String getMail() {
		return (client.getAdresseMail());
	}

	public String getCommentaire() {
		return commentaire;
	}

	public abstract boolean chevauche(Reservation autreReservation);

}
