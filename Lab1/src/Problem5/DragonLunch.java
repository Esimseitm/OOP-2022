package Problem5;

import java.util.Vector;

public class DragonLunch {
	public Vector<Person> people = new Vector<Person>(); 
	public void kidnap(Person p) { 
		   people.add(p); 
	   }
	   
    public boolean willDragonEatOrNot() { 
    	int size = people.size();
		int checker = 0;
		for(int i = 0; i < size; i++) {
			if(people.get(i).G == Gender.BOY)checker += 1;
			else checker -= 1;
			   
			if(checker < 0)return false;
		}
		if(checker == 0)return true;
		return false;
		   
    }

}