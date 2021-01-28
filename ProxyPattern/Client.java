package ProxyPattern;

public class Client {

	
	//This is virtual Proxy - when resource creation is expensive so we will not create it unless necessary.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject s = new ProxyClass("book");
		System.out.println(s.getNoPages());
		System.out.println(s.getNoPages());
	}

}
