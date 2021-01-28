package ProxyPattern;

public class ProxyClass implements Subject{

	//why null cz we dont want to instantiate it as soon as we call proxy obj.
	//we should instantiate it only when some method of it is called.
	private BookingParser b = null;
	private String s;
	public ProxyClass(String s) {
		this.s = s;
	}
	
	@Override
	public int getNoPages() {
		// TODO Auto-generated method stub
		if(b==null)
		{
			System.out.println(" only once ");
			b = new BookingParser(this.s);
			
		}
		
		//now deeletgate this function to the actual class.
		return this.b.getNoPages();
	}

}
