package factory;

public class CurrencyFactory {
	
	/**
	 * private to prevent instantiation
	 */
	private CurrencyFactory() {}
	
	/**
	 * return an instance of One of Several possible subclasses depending on the data provided to it.
	 * @param country countryName
	 * @return objects of subclasses of Currency
	 */
	static public Currency getCurrency(String country) {
		if(country.equals("India")) {
			return new Rupee();
		}else if(country.equals("USA")) {
			return new USDollar();
		}else if(country.equals("Singapore")) {
			return new SGDollar();
		}
		return null;
	}
}
