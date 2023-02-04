package Inheritance;

public class Van extends Vehicle{
	private boolean dirt;
	
	public Van(int numberOfGears, String color, boolean dirt) {
		super(numberOfGears, color);
		this.dirt = dirt;
		System.out.println("My Van is " + color + " it has " + numberOfGears + " gears it can be " + breakdirt(dirt));
	}
	public String breakdirt(boolean dirt) {
		if (!dirt) {
			return "Keep going for now";
		} else {
			return "be washed right now";
		}
	}
		
}
