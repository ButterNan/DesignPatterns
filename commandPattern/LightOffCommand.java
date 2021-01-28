package commandPattern;

public class LightOffCommand implements Command{

	public LightReceiver light;
	public LightOffCommand(LightReceiver l) {
		this.light=l;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println( " command turn Off");
		light.turnOff();
		
	}

}
