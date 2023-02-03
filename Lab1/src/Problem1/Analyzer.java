package Problem1;

import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		Data Dat = new Data();
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Enter number: (Q to quit): ");
			String numberString = input.next();
			if(numberString.equals("Q")) {
				System.out.println("Goodbye");
				break;
			}
			else {
				int number = Integer.parseInt(numberString);
				Dat.addValue(number);
			}
		}
		input.close();
		System.out.println("Average = " + Dat.averageValue());
		System.out.println("Maximum = " + Dat.getMax());
		
	}
}
