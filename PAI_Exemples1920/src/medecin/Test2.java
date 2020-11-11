package medecin;

public class Test2 {
	/**
	 * Test avec des r�f�rents du type "G�n�raliste" et des objets G�n�raliste et
	 * Sp�cialiste
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Generaliste poste1; // Ne permet pas d'op�rer
		poste1 = new Generaliste();
		poste1.prendreTension();
		poste1.suturer();
		// Ici je ne peux pas faire un type cast ==> BOOUM
		if (poste1 instanceof Specialiste)
			((Specialiste) poste1).operer();
		else
			System.out.println("Je ne suis pas un sp�cialiste!!!");

		System.out.println("--------------------");

		Generaliste poste2; // Ne permet pas d'op�rer
		poste2 = new Specialiste();
		poste2.prendreTension();
		System.out.println("Polymorphisme en action pour suturer");
		poste2.suturer();
		// Sachant que l'objet est un sp�cialiste
		// je peux faire un typecasting mais je dois etre certain
		// que c'est un sp�cialiste sinon BOOUM
		System.out.println("Grace au type casting");
		if (poste2 instanceof Specialiste)
			((Specialiste) poste2).operer();
		else
			System.out.println("Je ne suis pas un sp�cialiste!!!");

	}

}
