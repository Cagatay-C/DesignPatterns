package decoratorexamp2;

public abstract class DecoratorPizza implements Pizza{
	
	protected Pizza pizza;
	
	public DecoratorPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getDescription() {
		return this.pizza.getDescription();
	}

	public Double getCost() {
		return this.pizza.getCost();
	}
}
