package bic;

/**
 * 
 * @author Didier
 * @version 3 h�ritage
 */
public class Bic extends SystemeEcriture {
	private int niveau;

	public Bic(String couleur, String marque) {
		// Appel le constructeur parent (Systeme Ecriture)
		super(couleur, marque);
		this.niveau = 10;
		//System.out.println("Cr�ation d'un Bic. Nb Syst�mes d'�criture: " + getNbSystemeEcriture());
	}

	@Override
	public int getNiveau() {
		return niveau;
	}

	@Override
	protected void diminueNiveau() throws Exception {
		if (niveau > 0)
			niveau--;
		else
			throw new Exception("Plus d'encre");
	}

	@Override
	public String toString() {
		
		return "Cr�ation d'un Bic Niv: "+niveau+" "+super.toString();
	}
	
	

}
