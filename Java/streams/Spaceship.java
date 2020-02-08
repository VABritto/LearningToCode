package streams;

import java.util.Locale;

public class Spaceship {
	
	public String name;
	public boolean thrustersActivated = false;
	public boolean propulsionActivated = false;
	public boolean navSystemActivated = false;
	public boolean powerActivated = false;
	public boolean commsActivated = false;
	public boolean lifeSupportActivated = false;
	public double propulsionSpeed = 0;
	private double altitude = 0;
	final private double GRAVITY = 9.8;
	
	Spaceship(String name) {
		this.name = name;
	}
	
	public void activateAllSystems() {
		this.thrustersActivated = true;
		this.propulsionActivated = true;
		this.navSystemActivated = true;
		this.powerActivated = true;
		this.commsActivated = true;
		this.lifeSupportActivated = true;
	}

	public void deactivateAllSystems() {
		this.thrustersActivated = false;
		this.propulsionActivated = false;
		this.navSystemActivated = false;
		this.powerActivated = false;
		this.commsActivated = false;
		this.lifeSupportActivated = false;
		this.propulsionSpeed = 0;
	}
	
	public String checkAltitude() {
		if (navSystemActivated == true) {
			altitude += propulsionSpeed - GRAVITY;
			altitude = Double.parseDouble(String.format(Locale.ROOT, "%.2f", altitude));
			
			if (altitude <= 0) {
				altitude = 0;
			}
			return "Current altitude: " + altitude + "m.";
		} else {
			return "Navigation Control is offline...";
		}
	}

	public void propulsion() {
		if (propulsionActivated == true) {
			this.propulsionSpeed += 20.0;
		} else {
			this.propulsionSpeed = 0;
		}
	
	}
	
}
