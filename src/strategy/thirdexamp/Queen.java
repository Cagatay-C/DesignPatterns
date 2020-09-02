package strategy.thirdexamp;

public class Queen extends Character{
	
	public Queen() {
		weapon = new WeaponBehavior.KnifeBehavior();
	}

	@Override
	public void fight() {
		System.out.println("Queen is fighting");
	}
}
