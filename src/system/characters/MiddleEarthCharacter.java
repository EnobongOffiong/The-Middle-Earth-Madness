package system.characters;

public abstract class MiddleEarthCharacter {
	private String name;
	private Double power;
	private Double health;
	
	public abstract boolean attack (MiddleEarthCharacter target) ;
	public abstract String getRace();
	
	public MiddleEarthCharacter() {
		name = "Unknown";
		power = 0.0;
		health = 0.0;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPower(Double power) {
		this.power = power;
	}
	
	public Double getPower() {
		return power.doubleValue();
	}
	
	public void setHealth(Double health) {
		this.health = health;
	}
	
	public Double getHealth() {
		return health.doubleValue();
	}
	
	
	public void displayInfo() {
		System.out.println("Character: " + name);
        System.out.println("Race: " + getRace());
        System.out.println("Power: " + power);
        System.out.println("Health: " + health);
	}
	

}
