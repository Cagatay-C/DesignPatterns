package strategy.thirdexamp;

public class Troll extends Character{

	public Troll() {
		weapon = new WeaponBehavior.AxeBehavior();
	}
	
	@Override
	public void fight() {
		System.out.println("Troll is fighting");
	}
}
