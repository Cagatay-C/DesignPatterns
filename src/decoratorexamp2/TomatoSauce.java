package decoratorexamp2;

public class TomatoSauce extends DecoratorPizza{

	public TomatoSauce(Pizza pizza) {
		super(pizza);
		System.out.println("Adding Sauce");
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + ", Tomato Sauce";
	}

	@Override
	public Double getCost() {
		return pizza.getCost() + 0.50;
	}
}
