package StatePattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context c = new Context();
		StartState s = new StartState();
		StopState s1 = new StopState();
		c.setState(s);
		c.doSomething();
		
		c.setState(s1);
		c.doSomething();

	}

}
