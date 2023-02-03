package Problem5;


public class NewDragon extends DragonLunch {
	public NewDragon() {
		super();
	}
	
	public boolean dragonEatOrNot() {
		int adam = 0;
			for(Person p : people) {
				if (p instanceof Superman) {
					Superman sm = (Superman) p;
					sm.killDragon();
					return true;
				}
				if (p.getAge() >= 18) {
					adam++;
				}
			}
			return (adam == 0 ? false : true);
		}
}
  