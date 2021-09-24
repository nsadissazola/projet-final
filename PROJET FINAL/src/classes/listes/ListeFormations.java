package classes.listes;

import java.util.ArrayList;

import classes.Formation;

public class ListeFormations {
	public static ArrayList<Formation> Listformations = new ArrayList<Formation>();

	public static void addToList(Formation ft) {
		Listformations.add(ft);
	}

	public static void showList() {
		for (Formation f : Listformations) {
			System.out.println(f.toString());
		}
	}

}
