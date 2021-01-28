package strategyPattern;

public class Paypal implements Payment{

	private String emailId;
	private String password;
	
	public Paypal(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paypal.");
	}

}
