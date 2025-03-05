package system.characters;

public abstract class MiddleEarthCharacter {
	private final String name;
	private double power;
	private double health;
	
	public abstract boolean attack (MiddleEarthCharacter target) ;
	public abstract String getRace();
	
	// Constructor
	public MiddleEarthCharacter(String name, double power, double health) {
        this.name = name;
        this.power = power;
        this.health = health;
    }
	
	
	
	public String getName() {
		return name;
	}
	
	public void setPower(double power) {
		this.power = power;
	}
	
	public Double getPower() {
		return power;
	}
	
	public void setHealth(double health) {
		this.health = health;
	}
	
	public Double getHealth() {
		return health;
	}
	
	
	public void displayInfo() {
		System.out.println("Character: " + name);
        System.out.println("Race: " + getRace());
        System.out.println("Power: " + power);
        System.out.println("Health: " + health);
	}
	

}
