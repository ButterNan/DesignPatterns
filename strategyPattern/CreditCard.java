package strategyPattern;

public class CreditCard implements Payment{

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	public CreditCard(String nm, String ccNum,String cvv, String expiryDate) {
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
		
	}
	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount +" paid with credit/debit card");
		
	}

}
