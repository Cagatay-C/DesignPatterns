package strategy.secondexamp;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyBehavior.FlyNoWay();
		quackBehavior = new QuackBehavior.Quack();
	}
	
	@Override
	public void display() {
		System.out.println("Model Duck");
	}
}
