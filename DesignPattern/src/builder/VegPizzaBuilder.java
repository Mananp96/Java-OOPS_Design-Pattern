package builder;

public class VegPizzaBuilder extends Builder {

	@Override
	void build() {
		pizza.setCheese(true);
	}
}
