package MediatorPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mediator m =new MediatorImpl();
		User u1 = new UserImpl(m,"Nancy");
		User u2 = new UserImpl(m,"Sush");
		User u3 = new UserImpl(m,"Poo");
		m.addUser(u3);
		m.addUser(u2);
		m.addUser(u1);

		u1.sendMessage("Hello");
	}

}
