package fr.ensup.gestionEtablissementScolaire.service;

import java.util.List;

import fr.ensup.gestionEtablissementScolaire.dao.EtudiantDao;
import fr.ensup.gestionEtablissementScolaire.domaine.Etudiant;
import fr.ensup.gestionEtablissementScolaire.exception.DaoException;

public class EtudiantService implements IEtudiantService {

	EtudiantDao etud = new EtudiantDao();


	
	/**
	 * Cette fonction permet d'ajouter un étudiant dans la base de données
	 */
	@Override
	public void ajouterEtudiant(Etudiant etudiant) throws DaoException {

		etud.createEtudiant(etudiant);

	}

	/**
	 * Cette fonction permet d'afficher les informations d'un étudiant selon son identifiant
	 */
	@Override
	public Etudiant recupererEtudiant(int index) throws DaoException {

		System.out.println(etud.readEtudiantbyId(index));

		return etud.readEtudiantbyId(index);
	}

	/**
	 * Cette fonction permet de modifier l'adresse d'un étudiant selon son identifiant
	 */
	@Override
	public void modifierEtudiant(int index, String adresse) throws DaoException {

		etud.updateEtudiantbyId(index, adresse);

	}

	/**
	 * Cette fonction permet de supprimer un étudiant selon son identifiant
	 */
	@Override
	public void supprimerEtudiant(int index) throws DaoException {

		etud.deleteEtudiantbyId(index);

	}

	/**
	 * Cette fonction permet d'afficher la liste des étudiants de l'école
	 */
	@Override
	public List<Etudiant> recupererTout() throws DaoException {

		System.out.println(etud.getAll());

		return etud.getAll();
	}

}
