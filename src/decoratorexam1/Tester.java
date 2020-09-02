package decoratorexam1;

public class Tester {

	public static void main(String[] args) {
		
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		Shape redCircle = new RedShapeDecorator(new Circle());
		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		
		
		circle.draw();
		System.out.println();
		redCircle.draw();
		System.out.println();
		redRectangle.draw();
		System.out.println();
		rectangle.draw();
	}
}
