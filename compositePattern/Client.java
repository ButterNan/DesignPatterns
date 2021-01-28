package compositePattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component c = new Circle();
		Component s = new Square();
		
		Composite com = new Composite();
		
		//ussing add we added leaf to it.
		com.add(c);
		com.add(s);
		
		//now this draw is percolated to the leaf via composite.
		com.draw("RED");
	}

}
