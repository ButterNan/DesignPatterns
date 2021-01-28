package commandPattern;

public class Invoker {
	Command c;
	public Invoker(Command c) {
		this.c = c;
	}
	
	public void performTTask() {
		c.execute();
	}
}
