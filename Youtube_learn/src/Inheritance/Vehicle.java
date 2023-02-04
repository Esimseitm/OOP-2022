package Inheritance;

public class Vehicle {
	private int numberOfGears;
	private String color;
	
	public Vehicle(int numberOfGears, String color) {
		this.numberOfGears = numberOfGears;
		this.color = color;
	}
	
	public void drive() {
		System.out.println("brum-brum-brum");
	}
	
}
