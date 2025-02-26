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
}
