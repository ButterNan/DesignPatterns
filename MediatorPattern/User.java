package MediatorPattern;

public abstract class User {

	protected Mediator m;
	protected String name;
	public User(Mediator m, String s) {
		this.m=m;
		this.name = s;
	}
	public abstract void sendMessage(String s);
	public abstract void receiveMessage(String s);
}
