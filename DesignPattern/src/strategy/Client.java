package strategy;

public class Client {
	public static void main(String args[]) {
		Item itemOne = new Item("100", 500);
		Item itemTwo = new Item("101", 600);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addItem(itemOne);
		shoppingCart.addItem(itemTwo);
		//pay by credit card
		shoppingCart.pay(new CreditCardStrategy("Manan", "1234567890123456", "786", "12/15"));
		
		//pay by PayPal
		shoppingCart.pay(new PaypalStrategy("manan", "123456"));
	}
}
