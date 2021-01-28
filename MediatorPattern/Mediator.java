package MediatorPattern;

public abstract class Mediator {
	public abstract void sendMessage(String s, User u);
	abstract void addUser(User u);

}
