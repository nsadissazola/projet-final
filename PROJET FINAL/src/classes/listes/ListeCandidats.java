package classes.listes;

import java.util.ArrayList;

import classes.Candidat;

public class ListeCandidats {
	public static ArrayList<Candidat> Listcandidats = new ArrayList<Candidat>();

	public static void addToList(Candidat cdt) {
		Listcandidats.add(cdt);
	}

	public static void showList() {
		for (Candidat c : Listcandidats) {
			System.out.println(c.toString());
		}
	}

}
