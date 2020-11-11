package medecin;

/**
 * Test avec la version o� op�rer est d�fini au sein de la classe g�n�rale
 * 
 * @author Didier
 *
 */
public class Test3 {
	public static void main(String[] args) {

		Generaliste poste1; // Ne permet pas d'op�rer
		poste1 = new Generaliste();
		poste1.prendreTension();
		poste1.suturer();
		if (poste1 instanceof Specialiste)
			poste1.operer();

		System.out.println("--------------------");

		Generaliste poste2; // Ne permet pas d'op�rer
		poste2 = new Specialiste();
		poste2.prendreTension();
		System.out.println("Polymorphisme en action pour suturer");
		poste2.suturer();
		poste2.operer();

	}

}
