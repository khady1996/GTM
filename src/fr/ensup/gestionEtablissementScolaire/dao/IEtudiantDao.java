package fr.ensup.gestionEtablissementScolaire.dao;

import java.util.List;


import fr.ensup.gestionEtablissementScolaire.domaine.Etudiant;
import fr.ensup.gestionEtablissementScolaire.exception.DaoException;


public interface IEtudiantDao {
	
	// Créer un Etudiant
	public void createEtudiant(Etudiant etudiant)throws DaoException;  
	
	// Lire les informations d'un Etudiant
	public Etudiant readEtudiantbyId(int index) throws DaoException; 
	
	// Modifier une des informations sur l'étudiant
	public String updateEtudiantbyId(int index, String adresse)throws DaoException; 
	
	// Supprimer un étudiant
	public void deleteEtudiantbyId(int index)throws DaoException; 
	
	// Lister l'enselble des étudiants de l'école
	public List<Etudiant> getAll()throws DaoException;

}
