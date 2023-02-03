package studentPractice2;

public class Student {
	public String name;
	public int grade;
	public int id;
	
	public Student(int grade){
		this.grade = grade;
	}
	
	public Student(String name, int grade, int id){
		this.name = name;
		this.grade = grade;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return name + grade + id;
	}
	
}
