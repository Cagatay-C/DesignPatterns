package bridge;

public class Tester {

	public static void main(String[] args) {
		Shape redCircle = new Circle(1,5,2,new RedCircle());
		redCircle.draw();
		
		Shape greenCircle = new Circle(5,2,10,new GreenCircle());
		greenCircle.draw();
	}

}
