package ObserverPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Observer o1 = new ObserveImpl("o1");
		Observer o2 = new ObserveImpl("o2");
		Observer o3 = new ObserveImpl("o3");
		
		
		SubjectImpl s = new SubjectImpl();
		s.registerObserver(o3);
		s.registerObserver(o2);
		s.registerObserver(o1);
		o1.setSubject(s);
		o2.setSubject(s);
		o3.setSubject(s);
		
		s.postMessage("Posted");
		//o1.update();

	}

}
