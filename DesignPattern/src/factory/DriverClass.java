package factory;

public class DriverClass {
	public static void main(String args[]) {
		Currency india = CurrencyFactory.getCurrency("India");
		System.out.println("Indian Currency: "+india.getSymbol());
		
		Currency usa = CurrencyFactory.getCurrency("USA");
		System.out.println("USA Currency: "+usa.getSymbol());
		
		Currency singapore = CurrencyFactory.getCurrency("Singapore");
		System.out.println("Singapore Currency: "+singapore.getSymbol() );
	}
}
