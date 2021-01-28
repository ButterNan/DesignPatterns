package FlyweightPattern;

public class Truck implements Vehicle{
private int MA_SPEED; //intrinsic property
	private String color; //extrinsic 
	public Truck() {
		MA_SPEED = 120;
	}
	@Override
	public void assignColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	
	public int getMA_SPEED() {
		return MA_SPEED;
	}
	public String getColor() {
		return color;
	}
	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Color of truct is "+this.color+" with speed "+MA_SPEED);
	}

}
