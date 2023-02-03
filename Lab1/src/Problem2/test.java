package Problem2;

public class test {

	public static void main(String[] args) {
		Options op = new Options();
		op.Static();
		
		System.out.println(op.ANSWER);
		// if we final ANSWER, we get a error, because we cant set a new variable for final field
		
		// overloading	
		int x = 10; 
		int y = 14;
		System.out.println("sum: " + op.summa(x, y));
		
		double x1 = 14.10;
		double x2 = 10.14;
		System.out.println("sum(double): " + op.summa(x1, x2));
		
		// enum
		Choose myVar = Choose.MID;
		System.out.println(myVar);
		 
		
		System.out.println(op.age + op.name);
		  
//	    read-only fields 
	    System.out.println(Options.stcheck);
	}
}