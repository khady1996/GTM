package fr.ensup.gestionEtablissementScolaire.service;

public class ConnexionLogiciel {

	/**
	 * Cette fonction permet à l'utilisateur d'ouvrir une session qui lui permettra d'accéder aux fonctionnalités du logiciel
	 * Elle prend en paramètre le login et le mot de passe de l'utilisateur
	 */
	public boolean ouvrirsession(String login, String password) {

		if (login.equals("directeur") && password.equals("ensup")) {

			System.out.println("Bienvenue, vous êtes connectés en tant que Directeur de l'école");
			return true;
		}

		else if (login.equals("responsable") && password.equals("etude")) {

			System.out.println("Bienvenue, vous êtes connectés en tant que Responsable des études");
			return true;
		} else {
			System.out.println("L'identifiant et(ou) le mot de passe saisi sont incorrects.\n");
			return false;
		}
	}

}
