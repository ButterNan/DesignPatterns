package FlyweightPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v = Factory.getVehicle("truck");
		v.assignColor("red"); //we are setting extrinsic property.
		System.out.println(" okbj "+v);
		
		Vehicle v1 = Factory.getVehicle("truck");
		v.assignColor("blue");
		//System.out.println(" okbj "+v1  + v1.getColor());
	}

}
