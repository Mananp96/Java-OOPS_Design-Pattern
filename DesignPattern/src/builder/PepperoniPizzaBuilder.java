package builder;

public class PepperoniPizzaBuilder extends Builder{

	@Override
	void build() {
		pizza.setCheese(true);
		pizza.setPepperoni(true);
	}

}
