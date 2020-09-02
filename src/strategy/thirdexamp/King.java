package strategy.thirdexamp;

public class King extends Character{

	public King() {
		weapon = new WeaponBehavior.SwordBehavior();
	}
	
	@Override
	public void fight() {
		System.out.println("King is fighting");
	}
}
