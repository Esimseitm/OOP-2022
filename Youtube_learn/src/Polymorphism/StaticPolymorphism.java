package Polymorphism;

public class StaticPolymorphism {
	
	void test (int a) {
		System.out.println("method A - The value of a is " + a);
	}
	
	void test(int a, int b) {
		System.out.println("Method B - The values of a and b are " + a + "," + b);
	}
	
	double test(double a) {
		System.out.println("Method C - The value of a is " + a);
		return a*a;
	}
	
	
	
}
