package system.characters;

public abstract class MiddleEarthCharacter {
	private String name;
	private Double power;
	private Double health;
	
	
	public MiddleEarthCharacter() {
		name = "Unknown";
		power = 0.0;
		health = 0.0;
				
	}
	
	public abstract boolean attack (MiddleEarthCharacter target) ;
	public abstract String getRace();
	
	public void displayInfo() {
		System.out.println("Character: " + name);
        System.out.println("Race: " + getRace());
        System.out.println("Power: " + power);
        System.out.println("Health: " + health);
	}
	
	@Override 
	public String toString() {
		return name + " " + power + " " + health;
	}
}
