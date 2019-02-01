package fr.ensup.gestionEtablissementScolaire.presentation;

import java.util.Scanner;

import fr.ensup.gestionEtablissementScolaire.domaine.Etudiant;
import fr.ensup.gestionEtablissementScolaire.service.ConnexionLogiciel;
import fr.ensup.gestionEtablissementScolaire.service.EtudiantService;

public class Test {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		boolean conf = false;
		int choix = 6;

		ConnexionLogiciel session = new ConnexionLogiciel();

		Etudiant etu1 = new Etudiant(1, "NDIAYE", "KHADY", "knd@ensup.fr", "bagneux", "07.56.79.38.22", "1996");
		Etudiant etu2 = new Etudiant(2, "FALL", "COUMBA", "cfll@ensup.fr", "nanterre", "06.76.00.54.98", "1987");

		
		do {

			// Ouverture de session

			while (conf == false) {

				System.out.println("Veuillez-vous connecter SVP :\n");
				System.out.println("Login :");
				String log = scan.nextLine();
				System.out.println("\nPassword :");
				String pwd = scan.nextLine();

				conf = session.ouvrirsession(log, pwd);

			}

			EtudiantService etusv = new EtudiantService();

			System.out.println("Que souhaiteriez vous faire :\n" + "1 : Créer un étudiant\n"
					+ "2 : Lire les informations d'un étudiant\n" + "3 : Modifier une des informations sur l'étudiant\n"
					+ "4 : Supprimer un étudiant\n" + "5 : Lister l'ensemble des étudiants de l'école\n"
					+ "6 : Quitter\n");

			choix = scan.nextInt();

			switch (choix) {
			case 1:
				etusv.ajouterEtudiant(etu1); 
				etusv.ajouterEtudiant(etu2);
				break;
			case 2:
				etusv.recupererEtudiant(1);
				break;
			case 3:
				etusv.modifierEtudiant(2, "versailles");
				break;
			case 4:
				etusv.supprimerEtudiant(2);
				break;
			case 5:
				etusv.recupererTout();
				break;
			}

		} while (choix != 6);
	}

}
