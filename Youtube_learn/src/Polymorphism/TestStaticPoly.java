package Polymorphism;

public class TestStaticPoly {
	
	
	public static void main(String[] args) {
		StaticPolymorphism testpoly = new StaticPolymorphism();
		
		
		testpoly.test(12);
		testpoly.test(2, 3);
		
		double testval = 1200;
		double result = testpoly.test(testval);
		System.out.println("test result is: " + result);
	}

}
