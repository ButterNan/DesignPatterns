package DecoratorPattern;

public class Milk extends AddOnBeverage {

	Beverage bev;
	
	public Milk(Beverage b) {
		bev= b;
	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		System.out.println(" milk ");
		return bev.getCost()+6;
	}


}
