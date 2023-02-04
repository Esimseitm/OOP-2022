package Polymorphism;

public class DynamicPolymorphismTest {
	public static void main(String[] args) {
		Mammal mammal = new Caesar();
		mammal.name();
		
		
//		mammal.peeIn(); it's wrong
		
		Caesar caesar = (Caesar) mammal;
		caesar.peeIn();
		caesar.name();
	}
}
