package Problem4;

public class Course {
	private String courseName;
	private String aboutCourse;
	private int credits;
	private String prereqs;
	
	public Course(String courseName, String aboutCourse, int credits, String prereqs) {
		this.courseName = courseName;
		this.aboutCourse = aboutCourse;
		this.credits = credits;
		this.prereqs = prereqs;
	}
	
	public String toString() {
		return courseName + "\nAbout course: " + aboutCourse + "\ncredits: " + credits + "\nprerequisites: " + prereqs;
	}
}
