package fr.ensup.gestionEtablissementScolaire.exception;

public class DaoException extends Exception {

	public DaoException() {
		System.out.println("Problème venant du DAO : \n\tVerifier l'écriture de la requête");
	}
	
}
