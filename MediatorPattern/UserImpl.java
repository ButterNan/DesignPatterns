package MediatorPattern;

public class UserImpl extends User{

	public UserImpl(Mediator m, String s) {
		super(m, s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sendMessage(String s) {
		// TODO Auto-generated method stub
		System.out.println(this.name+": Sending Message="+s);
		this.m.sendMessage(s, this);
		
	}

	@Override
	public void receiveMessage(String s) {
		// TODO Auto-generated method stub
		System.out.println( " received message "+this.name+" "+s);
		
	}

}
