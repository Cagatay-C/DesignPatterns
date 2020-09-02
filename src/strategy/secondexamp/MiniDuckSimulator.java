package strategy.secondexamp;

import strategy.secondexamp.FlyBehavior.FlyNoWay;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck modelDuck = new ModelDuck();
		
		mallard.setFlyBehavior(new FlyBehavior.FlyRocketPowered());
		mallard.performFly();
		modelDuck.performFly();
	}
}
