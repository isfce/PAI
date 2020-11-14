package interfaceSwitch;

public class Lampe implements ISwitchable {

	private boolean allume = false;

	@Override
	public void on() {
		if (allume)
			System.out.println("Lampe d�j� allum�e");
		else {
			allume = true;
			System.out.println("Lampe allum�e");

		}

	}

	@Override
	public void off() {
		if (!allume)
			System.out.println("Lampe d�j� �teinte");
		else {
			allume = false;
			System.out.println("Lampe �teinte");

		}

	}

}
