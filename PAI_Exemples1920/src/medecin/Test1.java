package medecin;

public class Test1 {
/**
 * Test avec des r�f�rents du m�me type que les objets associ�s
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		Generaliste poste1; // Ne permet pas d'op�rer
		poste1=new Generaliste();
		poste1.prendreTension();
		poste1.suturer();
		
		System.out.println("--------------------");
	
		Specialiste poste2; //permet d'op�rer
		poste2=new Specialiste();
		poste2.prendreTension();
		poste2.suturer();
		poste2.operer();
		
	}

}
