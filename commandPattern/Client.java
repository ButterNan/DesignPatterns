package commandPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LightReceiver l = new LightReceiver();
		
		Command lightOn = new LightOnCommand(l);
		
		Invoker inv = new Invoker(lightOn);
		inv.performTTask();

	}

}
