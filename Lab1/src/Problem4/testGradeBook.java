package Problem4;

import java.util.Scanner;
import studentPractice2.Student;

public class testGradeBook {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Course course = new Course("Statistics", "Statistics is the mathematical study of change.",5, "Discrete Structures" );
		GradeBook gb = new GradeBook(course);
		gb.displayMessage();
		
		// add students
		/*gb.addStudent(new Student("Sinkau", 100, 1));
		gb.addStudent(new Student("Mkoto", 88,3));
		gb.addStudent(new Student("D",95,2));
		gb.addStudent(new Student("Ads", 60,4));
		gb.addStudent(new Student ("Lol", 25,5));
		*/
		Student s1 = new Student("Manarbek", 100, 1);
		Student s2 = new Student("Makoto", 88,3);
		Student s3 = new Student("D",95,2);
		//Student s4 = new Student("Ads", 60,4);
		//Student s5 = new Student ("Lol", 25,5);
		
		gb.addStudent(s1);
		gb.addStudent(s2);
		gb.addStudent(s3);
		
		gb.displayGradeReport();
		input.close();
		
	}
}
