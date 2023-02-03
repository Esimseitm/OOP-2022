package Problem4;

import java.util.Vector;
import studentPractice2.Student;

public class GradeBook {
	private Course course;
	private Vector <Student> students;
	private Student lowestGrade;
	private Student highestGrade;
	private int sumOfAllGrades;
	private int cnt;
	
	public GradeBook(Course course) {
		this.course = course;
	}
	
	private String[] distribution = {"00-09: ", "10-19: ", "20-29: ","30-39: ","40-49: ","50-59: ","60-69; ","70-79: ", "80-89: ", "90-99: ", "100:  "};
	
	{
		students = new Vector<Student>();
		highestGrade = new Student(0);
		lowestGrade = new Student(100);
	}
	
	public void addStudent(Student student) {
		if(student.grade <= lowestGrade.grade) {
			lowestGrade = student;
		}
		if(student.grade >= highestGrade.grade) {
			highestGrade = student;
		}
		int index = (int)Math.floor(student.grade/10);
		distribution[index] += "*";
		students.add(student);
		cnt++;
	}
	
	public double averageGrade() {
		for(Student student: students) {
			sumOfAllGrades += student.grade;
		}
		return (double)sumOfAllGrades / (double)cnt;
	}
	
	public void displayMessage() {
		System.out.println("Welcome to the grade book for "+ course + "!");
	}
	
	public void displayGradeReport() {
		System.out.println("Class average is " + averageGrade() + '.');
		System.out.println("Highest grade is " + highestGrade.grade + "(Student " + highestGrade.name + ", id: " + highestGrade.id + ").");
		System.out.println("Lowest grade is " + lowestGrade.grade + "(Student " + lowestGrade.name + ", id: " + lowestGrade.id + ").");
		System.out.println();
		System.out.println("Grades distribution: ");
		for (String grade: distribution) {
			System.out.println(grade);
		}
	}
	
	
	
	
}
