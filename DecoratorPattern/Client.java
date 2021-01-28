package DecoratorPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Beverage b = new Caramel(new Milk(new Espresso()));
		
		System.out.println(b.getCost());
		//this is a caramel + milk + espresso
	}

}
