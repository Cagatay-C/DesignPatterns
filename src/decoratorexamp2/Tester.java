package decoratorexamp2;

public class Tester {

	public static void main(String[] args) {
		Pizza newPizza = new TomatoSauce(new Mozarella(new PlainPizza()));
		Pizza withoutSauce = new Mozarella(new PlainPizza());
		System.out.println("Ingredients : " + newPizza.getDescription());
		System.out.println("Price: " + newPizza.getCost());
		
		
		System.out.println("Ingredients : " + withoutSauce.getDescription());
		System.out.println("Price: " + withoutSauce.getCost());

	}

}
