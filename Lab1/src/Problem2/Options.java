package Problem2;

public class Options {
	private static double result = 0;
	private static int cnt = 0;	
	public int choose;
	public String name;
	public int age;
	public final int ANSWER = 10;
	public static int stcheck = 5;
	
	{
		name = "John";
		age = 18;
		cnt = 1;
	}
	
	public Options() {
		cnt += 1;
	}
	
	public Options(String name) {
		this();
		this.name = name;
	}
	
	public Options(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public void Static() {
		cnt += 1;
	}
	
	public int summa(int n, int m) {
		result = n + m;
		return n + m;
	}
	
	public double summa(double n, double m ) {
		return n + m;
	}
	
	public double getResult() {
		return result;
	}

	public final void Holiday(String data){
		String newYear = "1stJanuary";
		System.out.print(newYear);
	}
	
	public final void display() {
		System.out.println("This is a final method.");
	}
	
	public static boolean Letsgo() {
		return true;
 	}
	
	public static int statcheck() {
		return stcheck;
	}
	
//	public int getCnt() {
//		return cnt;
//	}
}
