package system.characters;

public class Dwarf extends MiddleEarthCharacter{

	 public Dwarf(String name, double health, double power) {
	    	super(name, health, power);
	    }
		
		public String getRace() {
			return "Dwarf";
		}
		
		@Override
		public boolean attack(MiddleEarthCharacter target) {
			Double damage = 0.0;
			
			if(target.getRace().equalsIgnoreCase("Elf")) {
				damage = 1.5 * getPower();
				System.out.println("1.5x damage done");
			}
			
			else if(target.getRace().equalsIgnoreCase("Dwarf") || target.getRace().equalsIgnoreCase("Wizard")) {
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
