package Inheritance.Practice;

class Arithmetic {
	public int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

}

class Adder extends Arithmetic {
	
}




public class Solution {
	public static void main(String []args) {
		Adder a = new Adder();
		
	}
}
