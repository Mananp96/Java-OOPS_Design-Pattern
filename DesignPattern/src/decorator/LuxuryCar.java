package decorator;

public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car c) {
		super(c);
	}
	
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Luxury Car.");
	}
}
