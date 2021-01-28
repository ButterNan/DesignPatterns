package commandPattern;

public class LightOnCommand implements Command {

	LightReceiver light;
	public LightOnCommand(LightReceiver light) {
	this.light = light;	
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println( " command turn On");
		light.turnOn();
		//System.out.println( " command turn On");
		
	}

}
