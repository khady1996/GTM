package fr.ensup.gestionEtablissementScolaire.service;

import java.util.List;

import fr.ensup.gestionEtablissementScolaire.domaine.Etudiant;
import fr.ensup.gestionEtablissementScolaire.exception.DaoException;

public interface IEtudiantService {
	
	public void ajouterEtudiant(Etudiant etudiant) throws DaoException;
	public Etudiant recupererEtudiant(int index) throws DaoException;
	public void modifierEtudiant(int index, String adresse)throws DaoException;
	public void supprimerEtudiant(int index) throws DaoException;
	public List<Etudiant> recupererTout() throws DaoException;

}
