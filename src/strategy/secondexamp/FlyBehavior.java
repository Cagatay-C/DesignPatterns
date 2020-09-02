package strategy.secondexamp;

public interface FlyBehavior {
	
	public void fly();


	public class FlyWithWings implements FlyBehavior{

		@Override
		public void fly() {
			System.out.println("I am flying!!");	
		}	
	}

	public class FlyNoWay implements FlyBehavior{

		@Override
		public void fly() {
			System.out.println("I can't fly");	
		}
	}
	
	public class FlyRocketPowered implements FlyBehavior{

		@Override
		public void fly() {
			System.out.println("I'm flying with a Rocket!!");
		}	
	}
}
