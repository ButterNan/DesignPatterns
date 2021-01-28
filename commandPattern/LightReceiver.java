package commandPattern;

public class LightReceiver {

	public boolean turnOn = false;
	
	public void turnOn() {
		System.out.println( " receiver turn On");
		this.turnOn = true;
	}
	
	public void turnOff() {
		System.out.println( " receiver turn Off");
		this.turnOn = false;
	}
}
