package builderPattern;

public class PC {
	String ram;
	String hd;
	
	//optional
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	private PC(PCBuilder builder) {
//		this.ram = builder.RAM;
//		this.hd = builder.HD;
	}
	
	
	static class PCBuilder{
		
		private String HD;
		private String RAM;
		
		//optional
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		public PCBuilder() {
			
		
		}
		
		
		public void setHD(String hD) {
			HD = hD;
		}


		public void setRAM(String rAM) {
			RAM = rAM;
		}


		public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		}


		public void setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
		}


		public PC build() {
			return new PC(this);
		}
	}
}
