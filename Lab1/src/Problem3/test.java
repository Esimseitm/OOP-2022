package Problem3;

public class test {
	public static void main(String []args) {
		Temperature Uzunkol = new Temperature(25, 'C');
		System.out.println("Uzunkol: " + Uzunkol.toFahrenheit());
		System.out.println("Uzunkol: " + Uzunkol.toString());
		
		Temperature California = new Temperature(0);
		California.setBoth(50.00, 'F');
		System.out.println("California: " + California.toString());
		
		Temperature Astana = new Temperature('C');
		Astana.setTemperature(0);
		System.out.println("Astana: " + Astana.toString());
	}
}
