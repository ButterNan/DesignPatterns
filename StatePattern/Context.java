package StatePattern;

public class Context {

	State s;
	public Context() {
		this.s=null;
	}
	public void setState(State s) {
		this.s = s;
	}
	
	public State getState() {
		return this.s;
	}
	
	public void doSomething() {
		s.doAction();
	}
}
