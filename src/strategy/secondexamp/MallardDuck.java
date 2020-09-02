package strategy.secondexamp;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		flyBehavior = new FlyBehavior.FlyWithWings();
		quackBehavior = new QuackBehavior.Quack();
	}

	@Override
	public void display() {
		System.out.println("Mallard duck");	
	}

}
