package DecoratorPattern;

public class Caramel extends AddOnBeverage{

	Beverage b;
	public Caramel(Beverage b) {
		this.b = b;
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		
		return b.getCost()+10;
	}

}
