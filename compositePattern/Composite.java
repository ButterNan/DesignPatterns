package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

	List<Component> list = new ArrayList<Component>();
	@Override
	public void draw(String color) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			list.get(i).draw(color);
		}
		
	}
	
//adding shape to drawing
	public void add(Component s){
		this.list.add(s);
	}
	
	//removing shape from drawing
	public void remove(Component s){
		list.remove(s);
	}
	

}
