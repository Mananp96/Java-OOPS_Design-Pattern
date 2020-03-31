package strategy;

public class PaypalStrategy implements Strategy{

	private String userName;
	private String password;
	
	public PaypalStrategy(String newUserName,String newPassword) {
		this.userName = newUserName;
		this.password = newPassword;
	}
	
	@Override
	public void pay(int totalAmount) {
		System.out.println(totalAmount+" is paid using PayPal.");
	}

}
