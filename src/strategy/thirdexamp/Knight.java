package strategy.thirdexamp;

public class Knight extends Character{
	
	public Knight() {
		weapon = new WeaponBehavior.BowAndArrowBehavior();
	}

	@Override
	public void fight() {
		System.out.println("Knight is fighting");
	}
}
