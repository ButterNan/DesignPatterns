package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl extends Mediator {

	List<User> lst;
	public MediatorImpl() {
		lst = new ArrayList<>();
	}
	@Override
	public void sendMessage(String s, User u) {
		// TODO Auto-generated method stub
		for(User usr : this.lst){
			//message should not be received by the user sending it
			if(u != usr){
				usr.receiveMessage(s);
			}
		}
		
	}

	@Override
	void addUser(User u) {
		lst.add(u);
		// TODO Auto-generated method stub
		
	}
	

}
