package classes;

public class Formation {
	private int prix, nb_heures;
	private String titre, formateur;

	public Formation(int prix, int nb_heures, String titre, String formateur) {

		this.prix = prix;
		this.nb_heures = nb_heures;
		this.titre = titre;
		this.formateur = formateur;
	}

	public Formation() {

	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getNb_heures() {
		return nb_heures;
	}

	public void setNb_heures(int nb_heures) {
		this.nb_heures = nb_heures;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getFormateur() {
		return formateur;
	}

	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}

	@Override
	public String toString() {
		return "Formation [prix=" + prix + ", nb_heures=" + nb_heures + ", titre=" + titre + ", formateur=" + formateur
				+ "]";
	}

}
