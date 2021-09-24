package classes;

public class Session {
	private String debut, fin, titre_formation, lieu, mode;

	public Session(String debut, String fin, String titre_formation, String lieu, String mode) {

		this.debut = debut;
		this.fin = fin;
		this.titre_formation = titre_formation;
		this.lieu = lieu;
		this.mode = mode;
	}

	public Session() {

	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public String getTitre_formation() {
		return titre_formation;
	}

	public void setTitre_formation(String titre_formation) {
		this.titre_formation = titre_formation;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "Session [debut=" + debut + ", fin=" + fin + ", titre_formation=" + titre_formation + ", lieu=" + lieu
				+ ", mode=" + mode + "]";
	}

}
