package ProxyPattern;

public class BookingParser implements Subject{

	//expensive operation so dont instantiate directly.
	public BookingParser(String s) {
		
		
	}
	@Override
	public int getNoPages() {
		// TODO Auto-generated method stub
		System.out.println( " called real");
		return 5;
	}

}
