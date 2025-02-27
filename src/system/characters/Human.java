package system.characters;

public class Human extends MiddleEarthCharacter{
	
	public Human() {
		super();
	}
	
	public String getRace() {
		return "Human";
	}
	@Override
	public boolean attack(MiddleEarthCharacter target) {
		Double damage = 0.0;
		
		if(target.getRace().equalsIgnoreCase("Wizard")) {
			damage = 1.5 * getPower();
			System.out.println("1.5x damage done");
		}
		
		else if(target.getRace().equalsIgnoreCase("Orc") || target.getRace().equals("Human")) {
			System.out.println("No damage done to " + target.getRace());
			return true;
		}
		
		else {
			damage = getPower();
			System.out.println("Regular damage done to" + target.getRace());
		}
		
		double newHealth = Math.max(0, target.getHealth() - damage);
        target.setHealth(newHealth);

        return true;
		
	}
}
