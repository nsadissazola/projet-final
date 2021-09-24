package testing;

public class VerifContraintes {
	public boolean idPositif(int id) {

		return id > 0;

	}

	public boolean longueurTitre(String titre) {
		return titre.length() >= 3;

	}

	public boolean prixValide(int prix) {
		return prix > 100;
	}

	public boolean nbHeuresValide(int nb_heures) {
		return nb_heures > 10;
	}

	public boolean modeSession(String session) {

		if (session.equals("présentiel") || session.equals("en ligne"))
			return true;
		else
			return false;

	}

	public boolean gradeFormateur(String f) {
		if (f.equals("junior") || f.equals("senior") || f.equals("expert"))
			return true;
		else
			return false;

	}

	public boolean verifChaine(String x) {

		return !x.isEmpty();
	}

	public boolean verifNum(Integer y) {

		return !(y == null);
	}

}
