package fr.ensup.gestionEtablissementScolaire.domaine;

public class Enseignant extends Personne {

	private String matiere;

	// Constructeur

	public Enseignant(int id, String nom, String prenom, String email, String adresse, String telephone) {
		super(id, nom, prenom, email, adresse, telephone);
		// TODO Auto-generated constructor stub
	}

	// Getter et Setter

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

}
