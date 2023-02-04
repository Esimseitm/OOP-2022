package EqualsHashcode;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;

public class HashCode1 {
	public static void main(String[] args) {
		Map< Student, Double> map = new HashMap<>();
		
		Student st1 = new Student("manarbek", "Yessimseit", 3);
		Student st2 = new Student("Maksat", "Jusupov", 1);
		Student st3 = new Student("Aman", "Orazbai", 4);
		map.put(st1,  7.5);
		map.put(st2,  8.7);
		map.put(st3,  9.2);
		System.out.println(map);
		Student st4 = new Student("manarbek", "Yessimseit", 3);
		
//		boolean result = map.containsKey(st4);
//		System.out.println("result = " + result);
//		System.out.println(st1.equals(st4));
		
		System.out.println(st1.hashCode());
		System.out.println(st4.hashCode());
		
		
		
		
	}
} 

class Student {
	String name;
	String surname;
	int course;
	
	public Student(String name, String surname, int course) {
		this.name = name;
		this.surname = surname;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student{" +
				"name=" + name + '\'' + 
				", surname=' " + surname +'\'' +
				", course= '" + course +
				'}';
				
	}
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Student student = (Student) o;
		
		return course == student.course && 
				Objects.equals(name, student.name) &&
				Objects.equals(surname, student.surname);
		
	}
	public int hashCode() {
		return Objects.hash(name, surname, course);
	}
	
}

