package fr.ensup.gestionEtablissementScolaire.domaine;

import fr.ensup.gestionEtablissementScolaire.domaine.Personne;

public class Ecole {

	private String nom;
	private String email;
	private String adresse;
	private String telephone;
	private Personne directeur;

	// Constructeur

	public Ecole(String nom, String email, String adresse, String telephone, Personne directeur) {
		super();
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.directeur = directeur;
	}

	// Getters et Setters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Personne getDirecteur() {
		return directeur;
	}

	public void setDirecteur(Personne directeur) {
		this.directeur = directeur;
	}

}
