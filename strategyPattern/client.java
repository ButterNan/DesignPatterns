package strategyPattern;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart s = new ShoppingCart();
		Item i = new Item("apple",25);
		Item i1 = new Item("chocolate",125);
		s.addItem(i);
		s.addItem(i1);

		s.pay(new CreditCard("nancy","123","87","1234"));
	}

}
