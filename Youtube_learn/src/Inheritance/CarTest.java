package Inheritance;

public class CarTest {
	public static void main(String[] args) {
		
		Car carOne = new Car(5, "Green", true);
		carOne.drive();
		
		Van vanOne = new Van(6, "Orange", false);
		vanOne.drive();
		
		System.out.println(carOne instanceof Car);
		
		
	}
}
