package strategy;

public class CreditCardStrategy implements Strategy{
	
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
		this.name=nm;
		this.cardNumber=ccNum;
		this.cvv=cvv;
		this.dateOfExpiry=expiryDate;
	}
	
	@Override
	public void pay(int totalAmount) {
		System.out.println(totalAmount+" is paid using Credit Card.");
	}

}
