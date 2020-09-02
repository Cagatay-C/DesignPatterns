package decoratorexamp2;

public class Mozarella extends DecoratorPizza{

	public Mozarella(Pizza pizza) {
		super(pizza);
		System.out.println("Added mozarella");
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + " , Mozarella ";
	}

	@Override
	public Double getCost() {
		return pizza.getCost() + .50;
	}

}
