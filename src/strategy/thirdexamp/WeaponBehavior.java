package strategy.thirdexamp;

public interface WeaponBehavior {
	
	public void useWeapon();
	
	public class KnifeBehavior implements WeaponBehavior{

		@Override
		public void useWeapon() {
			System.out.println("Using Knife");
		}
	}
	
	public class BowAndArrowBehavior implements WeaponBehavior{

		@Override
		public void useWeapon() {
			System.out.println("Using Bow and Arrow");	
		}
	}
	
	public class AxeBehavior implements WeaponBehavior{

		@Override
		public void useWeapon() {
			System.out.println("Using Axe");		
		}
	}
	
	public class SwordBehavior implements WeaponBehavior{

		@Override
		public void useWeapon() {
			System.out.println("Using Sword");		
		}
	}
}
