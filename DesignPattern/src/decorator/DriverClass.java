package decorator;

public class DriverClass {
	
	public static void main(String args[]) {
		Car car = new BasicCar();
		car = new SportCar(car);
		car.assemble();
		
		Car luxuryCar = new LuxuryCar(car);
		luxuryCar.assemble();
	}
	
}
