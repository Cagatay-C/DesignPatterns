package factory;

public abstract class EnemyShip {
	
	private String shipName;
	private String shipDamage;
	
	public String getShipName() {
		return this.shipName;
	}
	
	public String getShipDamage() {
		return this.shipDamage;
	}
	
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	public void setShipDamage(String shipDamage) {
		this.shipDamage = shipDamage;
	}
	
	public void followHero() {
		System.out.println(getShipName() + " is following the hero"); 
	}
	
	public void displayEnemyShip() {
		System.out.println(getShipName() + " is on the screen");
	}
	
	public void attack() {
		System.out.println(getShipName() + " attacked and does " + getShipDamage());
	}
	
	public void doStuff() {
		followHero();
		displayEnemyShip();
		attack();
	}
}
