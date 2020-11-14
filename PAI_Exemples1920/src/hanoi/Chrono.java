package hanoi;

public class Chrono {
	private Long startTime;
	private Long stopTime;
	private boolean start;

	/**
	 * 
	 */
	public Chrono() {
		start = false;
		startTime = (long) 0;
		stopTime = (long) 0;
	}

	/**
	 * 
	 */
	public void start() {
		if (!start) {
			startTime = System.currentTimeMillis();
			start = true;
		}
	}

	/**
	 * 
	 */
	public void stop() {
		if (start) {
			stopTime = System.currentTimeMillis();
			start = false;
		}
	}

	/**
	 * Si le chrono tourne donne la dur�e actuelle Si le chrono est arr�t�, donne la
	 * dur�e entre les 2 temps
	 * 
	 * @return dur�e en secondes
	 */
	public int getNbSecondes() {
		Long time;
		if (start)
			time = System.currentTimeMillis();
		else
			time = stopTime;

		return (int) ((time - startTime) / 1000);
	}

	public void reset() {
		start = false;
		startTime = (long) 0;
		stopTime = (long) 0;
	}
}
