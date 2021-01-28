package ObserverPattern;

public class ObserveImpl implements Observer{

	private String name;
	private Subject subject;
	public ObserveImpl(String n) {
		this.name = n;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		String msg = (String) subject.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
		
	}

	@Override
	public void setSubject(Subject s) {
		// TODO Auto-generated method stub
		this.subject = s;
		
	}

}
