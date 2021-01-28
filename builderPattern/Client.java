package builderPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//so the way to create an instance of Computer is via BuilderPattern and call setter methods for optional parameters 
		//and use the build method to create the obj
		Computer c = new Computer.BuilderComputer("2 GB","2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		
		
		//another obj creation.. wat if all the paramters are set via setter function 
		//then we will need to throw error in case some required paramter is not set.
		
//		PC pc = new PC.PCBuilder().setHD("2 GB").setBluetoothEnabled(true)
//				.setGraphicsCardEnabled(true).build();
	}

}
