package classes.listes;

import java.util.ArrayList;

import classes.Formateur;

public class ListeFormateurs {
	public static ArrayList<Formateur> Listformateurs = new ArrayList<Formateur>();

	public static void addToList(Formateur fmt) {
		Listformateurs.add(fmt);
	}

	public static void showList() {
		for (Formateur f : Listformateurs) {
			System.out.println(f.toString());
		}
	}

}
