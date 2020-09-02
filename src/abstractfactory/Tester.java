package abstractfactory;

public class Tester {

	public static void main(String[] args) {
		AbstractFactory factory = new RoundedShapeFactory();
		factory.getShape("SQUARE").draw();
		factory.getShape("RECTANGLE").draw();
		
		factory = new ShapeFactory();
		factory.getShape("SQUARE").draw();;
		factory.getShape("RECTANGLE").draw();
	}
}
