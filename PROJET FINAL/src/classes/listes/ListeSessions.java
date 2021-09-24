package classes.listes;

import java.util.ArrayList;

import classes.Session;

public class ListeSessions {
	public static ArrayList<Session> Listsessions = new ArrayList<Session>();

	public static void addToList(Session ses) {
		Listsessions.add(ses);
	}

	public static void showList() {
		for (Session s : Listsessions) {
			System.out.println(s.toString());
		}
	}
}
