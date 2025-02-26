package system.characters;

public class Elf extends MiddleEarthCharacter{
	
	public Elf() {
		super();
	}
	
	public String getRace() {
		return "Elf";
	}
	
	public boolean attack(MiddleEarthCharacter target) {
		Double damage = 0.0;
		
		if(target.getRace().equalsIgnoreCase("Orc")) {
			damage = 1.5 * getPower();
			System.out.println("1.5x damage done");
		}
		
		else if(target.getRace().equals("Dwarf") || target.getRace().equals("Elf")) {
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
