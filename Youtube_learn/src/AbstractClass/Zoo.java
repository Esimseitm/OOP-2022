package AbstractClass;

public class Zoo {
	public static void main(String[] args) {
		//Animal  a = new Animal(4);
		Animal a = new Tiger();
		
		
		System.out.println("Animal " + a.getClass().getName()
				+ " has " + a.getEyes() + " eyes. "
				+ "and eats " + a.eatsFood()
				);
		
		
	}
}
