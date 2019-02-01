package fr.ensup.gestionEtablissementScolaire.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.ensup.gestionEtablissementScolaire.domaine.Etudiant;
import fr.ensup.gestionEtablissementScolaire.exception.DaoException;

/**
 * @author khadyndiaye
 *
 */
public class EtudiantDao implements IEtudiantDao {

	AccesBd bd = new AccesBd();

	
	/* 
	 * Cette fonction permet d'ajouter un étudiant dans la base de données
	 */
	@Override
	public void createEtudiant(Etudiant etudiant) throws DaoException {
		// TODO Auto-generated method stub

		bd.seConnecter();
		try {

			String requete = "INSERT INTO `Etudiant` (`id`,`nom`,`prenom`,`email`,`adresse`,`telephone`,`datenaissance`) VALUES ('"
					+ etudiant.getId() + "','" + etudiant.getNom() + "','" + etudiant.getPrenom() + "','"
					+ etudiant.getEmail() + "','" + etudiant.getAdresse() + "','" + etudiant.getTelephone() + "','"
					+ etudiant.getDatenaissance() + "');";

			bd.st.executeUpdate(requete);

		} catch (SQLException e) {

			new DaoException();
		}

		bd.seDeconnecter();

	}
	
	@Override
	public Etudiant readEtudiantbyId(int index) throws DaoException {
		// TODO Auto-generated method stub
		Etudiant etu = null;

		bd.seConnecter();
		try {

			String requete = "SELECT * FROM `Etudiant` WHERE `id` = '" + index + "';";
			ResultSet rs = bd.st.executeQuery(requete);

			while (rs.next()) {
				etu = new Etudiant(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"),
						rs.getString("adresse"), rs.getString("telephone"), rs.getString("datenaissance"));

			}

		} catch (SQLException e) {

			new DaoException();

		}

		bd.seDeconnecter();

		return etu;
	}

	@Override
	public String updateEtudiantbyId(int index, String adresse) throws DaoException {

		int rs = 0;

		bd.seConnecter();

		try {
			String requete = "UPDATE `Etudiant` SET `adresse` = '" + adresse + "' WHERE `id` = '" + index + "';";

			rs = bd.st.executeUpdate(requete);

			if (rs != 0) {

				bd.seDeconnecter();

				return "OK.Vous avez modifié l'adresse de cet étudiant \n";
			}

		} catch (SQLException e) {

			new DaoException();
		}

		bd.seDeconnecter();

		return "Modification non prise en compte";
	}

	@Override
	public void deleteEtudiantbyId(int index) throws DaoException {

		bd.seConnecter();

		try {
			String requete = "DELETE FROM `Etudiant` WHERE `id` = '" + index + "';";
			bd.st.executeUpdate(requete);

			System.out.println("L'étudiant a été supprimé avec succés !!");

		} catch (SQLException e) {

			new DaoException();
		}

		bd.seDeconnecter();

	}

	@Override
	public List<Etudiant> getAll() throws DaoException {

		List<Etudiant> listetu = new ArrayList<Etudiant>();

		bd.seConnecter();
		try {
			String requete = "SELECT * FROM `Etudiant`;";
			ResultSet rs = bd.st.executeQuery(requete);

			while (rs.next()) {

				listetu.add(new Etudiant(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"),
						rs.getString("email"), rs.getString("adresse"), rs.getString("telephone"),
						rs.getString("datenaissance")));

			}

		} catch (SQLException e) {

			new DaoException();
		}

		bd.seDeconnecter();

		return listetu;
	}

}
