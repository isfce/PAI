package bic;

/**
 * 
 * @author Didier
 * @version 2 (m�thode statique)
 */
public class Bic {
	// M�thode statique
	private static int nbSystemesEcriture = 0;
	private final String couleur;
	private int niveau;
	private final String marque;
	private boolean etat;

	public Bic(String couleur, String marque) {
		this.couleur = couleur;
		this.marque = marque;
		this.etat = false;
		this.niveau = 10;
		nbSystemesEcriture++;
		System.out.println("Cr�ation d'un Bic. Nb Syst�mes d'�criture: " + nbSystemesEcriture);
	}

	public void ecrire() {
		if (!etat)
			System.out.println("Bic Ferm�");
		else if (niveau == 0)
			System.out.println("Bic vide");
		else {
			niveau--;
			System.out.println("Ecriture en " + couleur + " niv: " + niveau);
		}
	}

	public String getCouleur() {
		return couleur;
	}

	public int getNiveau() {
		return niveau;
	}

	public String getMarque() {
		return marque;
	}

	public boolean isEtat() {
		return etat;
	}

	public void ouvrir() {
		etat = true;
		System.out.println("Etat Ouvert");
	}

	public void fermer() {
		etat = false;
		System.out.println("Etat Ferm�");
	}

	// m�thode statique
	public static int getNbSystemeEcriture() {
		return nbSystemesEcriture;
	}

}
