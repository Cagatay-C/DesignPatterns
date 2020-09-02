package strategy.thirdexamp;

public abstract class Character {
	
	WeaponBehavior weapon;
	
	public abstract void fight();
	
	public void attackWithWeapon() {
		this.weapon.useWeapon();
	}
	
	public void setWeapon(WeaponBehavior weapon) {
		this.weapon = weapon;
	}
}
