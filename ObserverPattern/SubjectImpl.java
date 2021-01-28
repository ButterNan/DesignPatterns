package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{

	private List<Observer> lst;
	private final Object MUTEX = new Object();
	private boolean changed = false;
	private String message =null;
	public SubjectImpl() {
		lst = new ArrayList<>();
	}
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		if(o==null)
			throw new NullPointerException("null observer");

			synchronized(MUTEX) {
				if(!lst.contains(o))
					lst.add(o);
			}
		
	}

	@Override
	public void unregisterObserver(Observer o) {
		// TODO Auto-generated method stub
		synchronized(MUTEX) {
		lst.remove(o);
		}
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		List<Observer> observersLocal = null;
		//synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocal = new ArrayList<>(this.lst);
			this.changed=false;
		}
		for (Observer obj : observersLocal) {
			obj.update();
		}
		
	}

	@Override
	public Object getUpdate(Observer o) {
		// TODO Auto-generated method stub
		return this.message;
	}

	//method to post message to the topic
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
		this.message=msg;
		this.changed=true;
		notifyObserver();
	}
}
