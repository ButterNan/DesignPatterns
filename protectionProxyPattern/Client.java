package protectionProxyPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject s = new ProxyClass("Nancy","adobe");
		System.out.println(s.noOfPages());
		
		Subject s1 = new ProxyClass("gouravs","adobe");
		s1.noOfPages();
	}

}
