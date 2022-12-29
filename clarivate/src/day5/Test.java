package day5;

public class Test {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Vehicle v=new Car();
		v.drive();
		v.color="blue";v.fuel_type="petrol";
		Car c=(Car)v;
		c.brand="bmw";
		System.out.println(c.brand);
		c.drift();
		Bike b=(Bike)v;
	}
}
