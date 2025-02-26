package system.characters;

public class Elf extends MiddleEarthCharacter{
	public Elf() {
		super();
	}
	
	public String getRace() {
		return "Elf";
	}
	
	public boolean attack(MiddleEarthCharacter target) {
		if(target.getRace().equals("Orc")) {
			Double currentHealth = target.getHealth();
			Double newHealth = currentHealth - (1.5 * getPower());
			target.setHealth(newHealth);
			
			System.out.println("1.5x damage done");
			return true;
		}
		else if(target.getRace().equals("Dwarf") || target.getRace().equals("Elf")) {
			System.out.println("No damage done");
			return true;
		}
		else {
			Double currentHealth = target.getHealth();
			Double newHealth = currentHealth - (getPower());
			target.setHealth(newHealth);
			
			System.out.println("Regular damage done");
			return true;
		}
		
	}
}
