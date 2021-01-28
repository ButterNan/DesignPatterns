package builderPattern;

public class Computer {
	
	
	//required parameters
	private String HDD;
	private String RAM;
		
	//optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	//1. We should not have setter function in this class as this will be done by Builder class
	
	//2.the constructor should be private so that no one  can use this to create the obj.
	private Computer(BuilderComputer builder) {
		this.HDD=builder.HDD;
		this.RAM=builder.RAM;
		this.isGraphicsCardEnabled=builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=builder.isBluetoothEnabled;
	}
	
	
	
	public String getHDD() {
		return HDD;
	}



	public String getRAM() {
		return RAM;
	}



	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}



	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}


	//3. the class will be static so that there is only 1 instancee of this builder class. As there will be jst 1 dukaan to create the obj
	static class BuilderComputer{
		//required parameters
		private String HDD;
		private String RAM;
			
		//optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public BuilderComputer(String hdd,String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}
		
		//we will use setter function for optional parameters.
		public BuilderComputer setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public BuilderComputer setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		//this function will be used to create the instance so it should call constructor of Computer
		public Computer build() {
			return new Computer(this);
		}
	}

}
