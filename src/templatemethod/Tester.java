package templatemethod;

public class Tester {

	public static void main(String[] args) {
		
		Game cricket = new Cricket();
		Game football = new Football();
		
		cricket.play();
		System.out.println();
		football.play();

	}
}
