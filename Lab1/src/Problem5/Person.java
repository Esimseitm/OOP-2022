package Problem5;

public class Person {
	public static final String Gen = null;
	public String name;
	public Gender G;
	public int age;
	
	Person(String name, Gender G, int age){
		this.name = name;
		this.G = G;
		this.age = age;
	}
	
	public String toString(String name, Gender G) {
		return name + G;
	}
	
	public Gender getGender() {
		return G;
	}
	public int getAge() {
		return age;
	}
	
//	public enum Gen{
//		BOYS, GIRLS;
//	}
}
