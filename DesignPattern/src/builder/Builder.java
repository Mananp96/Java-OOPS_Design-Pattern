package builder;

public abstract class Builder {
	
	protected Pizza pizza;
	
	public Pizza getPizza() {
		return pizza;
	}
	
	public void createNewPizza(int size) {
		pizza = new Pizza(size);
	}
	
	abstract void build();
}
