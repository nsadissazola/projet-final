package testing.fonction;

import classes.Formateur;
import classes.Session;
import classes.listes.ListeFormateurs;
import classes.listes.ListeSessions;
import testing.VerifContraintes;

public class TestAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Les classes d'équivalences c'est ici

		VerifContraintes vc = new VerifContraintes();

		// Id (candidat) {0,10,-3}
		if (vc.idPositif(10))
			System.out.println("id valide");
		else if (vc.idPositif(0) || vc.idPositif(-3))
			System.out.println("id invalide");

		// Titre :{ 2 , 3, 8}
		// Je pars ici du principe que vous parlez de la longueur du titre et que l'on
		// veut tester si des titres de longueurs 2 et 3 passeraient
		if (vc.longueurTitre("aa"))
			System.out.println("Titre invalide, trop court");
		else if (vc.longueurTitre("aaa") || vc.longueurTitre("aaaaaaaa")) // longueurs 3 ou 8 caractères
			System.out.println("Titre valide");

		// Prix: { 0, 100, 250}
		if (vc.prixValide(0) || vc.prixValide(100))
			System.out.println("Prix invalide");
		else if (vc.prixValide(250))
			System.out.println("Prix valide");

		// Nb_heures: { 10, 11, 40}
		if (vc.nbHeuresValide(10))
			System.out.println("Heure invalide");
		else if (vc.nbHeuresValide(11) || vc.nbHeuresValide(40))
			System.out.println("Heure valide");

		// 3 champs aléatoires non tester : utiliser une chaine vide

		if (vc.verifChaine(""))
			System.out.println("Le champ ne peut pas etre vide");
		if (vc.verifNum(null))
			System.out.println("Le champ ne peut pas etre vide");

		// Session : (aléatoire) # correcte
		// Session(String debut, String fin, String titre_formation, String lieu, String
		// mode)
		String debut = "lundi";
		String fin = "mardi";
		String titre_formation = "random";
		String lieu = "Paris";
		String mode = "en ligne";

		Session s1 = null;
		if (vc.longueurTitre(titre_formation))
			if (vc.modeSession("en ligne"))
				s1 = new Session(debut, fin, titre_formation, lieu, mode);

		ListeSessions.Listsessions.add(s1);
		ListeSessions.showList();
		
		// Formateur : (aléatoire) # correcte
		// Formateur(String nom, String prenom, String specialite, String grade)
		String nom = "toto";
		String prenom = "tata";
		String specialite = "random";
		String grade = "expert";
		
		Formateur f = null;
		if(!vc.gradeFormateur("expert"))
			System.out.println("Erreur");
		else
			f = new Formateur(nom, prenom, specialite, grade);
		
		ListeFormateurs.Listformateurs.add(f);
		ListeFormateurs.showList();
		

	}
	
	

}
