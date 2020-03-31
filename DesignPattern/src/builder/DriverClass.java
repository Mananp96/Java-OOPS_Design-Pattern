package builder;

public class DriverClass {
	Pizza vegPizza,pepperoniPizza;
	static final int SMALL_SIZE = 6;
	static final int MEDIUM_SIZE = 10;
	static final int LARGE_SIZE = 12;
	
	public static void main(String args[]) {
		Builder vegPizzaBuilder = new VegPizzaBuilder();
		Builder pepperoniPizzaBuilder = new PepperoniPizzaBuilder();
		
		Director director = new Director();
		director.setBuilder(vegPizzaBuilder);
		director.makePizza(LARGE_SIZE);
		System.out.print(director.getPizza());
		
		director.setBuilder(pepperoniPizzaBuilder);
		director.makePizza(MEDIUM_SIZE);
		System.out.println(director.getPizza());
		
	}
	
	
}
