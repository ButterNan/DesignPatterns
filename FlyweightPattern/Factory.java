package FlyweightPattern;

import java.util.HashMap;

public class Factory {

	private static HashMap<String, Vehicle> map=new HashMap<>();
	public static Vehicle getVehicle(String type) {
		Vehicle v = null;
		if(map.containsKey(type)) {
			v = map.get(type);
			return v;
		}else {
			
			switch(type) {
				case "truck":
					v = new Truck();
					break;
				default:
					System.out.println(" error");
			}
				map.put(type, v);	
		}
		
		return v;
	}
}
