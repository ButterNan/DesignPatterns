package protectionProxyPattern;

public class ProxyClass implements Subject{

	private BookParser b= null;
	private boolean  allowed=false;
	public ProxyClass(String name, String password) {
		if(name.equals("Nancy") && password.equals("adobe")) {
			allowed = true;
		}
		b = new BookParser();
	}
	@Override
	public int noOfPages() {
		// TODO Auto-generated method stub
		if(allowed) {
			return b.noOfPages();
		}
		else {
			System.out.println(" not allowed for non admin");
			return -1;
		}
	}

}
