package medecin;

public class Specialiste extends Generaliste {
	public void operer() {
		System.out.println("J'op�re");
	}

	@Override
	public void suturer() {
		System.out.println("Je pr�pare ma suture comme un sp�cialiste");
		super.suturer();// appel du traitement parent (g�n�raliste)
		System.out.println("J'utilise en plus ma machine sp�cialis�e");
	}

}
