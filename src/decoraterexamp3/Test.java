package decoraterexamp3;

public class Test {
	
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println("Beverage:" + beverage.getDescription() + " Cost:" + beverage.cost());
		beverage = new Mocha(beverage);
		beverage.setSize("G");
		System.out.println("Beverage:" + beverage.getDescription() + " Cost:" + beverage.cost() + 
				" Size:" + beverage.getSize());
		
		Beverage beverageSec = new HouseBlend();
		beverageSec.setSize("V");
		System.out.println();
		System.out.println("Beverage:" + beverageSec.getDescription() + " Cost:" + beverageSec.cost() + 
				" Size:" + beverageSec.getSize());
		beverageSec = new Mocha(new Whip(beverageSec));
		System.out.println("Beverage:" + beverageSec.getDescription() + " Cost:" + beverageSec.cost() + 
				" Size:" + beverageSec.getSize());
	}

}
