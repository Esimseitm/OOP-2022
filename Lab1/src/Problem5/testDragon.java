package Problem5;

public class testDragon {
	public static void main(String []args) {
		DragonLunch dl = new NewDragon();
		Person p2 = new Person("B", Gender.BOY, 6);
		Person p3 = new Person("B", Gender.GIRL, 6);
		Person p4 = new Person("B", Gender.GIRL, 6);
		
		
		dl.kidnap(p2);
		dl.kidnap(p3);
		dl.kidnap(p4);
		System.out.println(dl.willDragonEatOrNot());
		
	}
}
