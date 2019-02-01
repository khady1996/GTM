package fr.ensup.gestionEtablissementScolaire.domaine;

public class Etudiant extends Personne {

	private String datenaissance;

	// Constructeur

	public Etudiant(int id, String nom, String prenom, String email, String adresse, String telephone, String datenaissance) {
		super(id, nom, prenom, email, adresse, telephone);
		this.datenaissance = datenaissance;
	}

	// Getter et Setter

	public String getDatenaissance() {
		return datenaissance;
	}

	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}
	
	

}
