package builder;

public class Director {
	
	private Builder builder;
	
	public void setBuilder(Builder newbuilder) {
		builder = newbuilder;
	}
	
	public void makePizza(int size) {
		builder.createNewPizza(size);
		builder.build();
	}
	
	public String getPizza() {
		return builder.getPizza().toString();
	}
	
}
