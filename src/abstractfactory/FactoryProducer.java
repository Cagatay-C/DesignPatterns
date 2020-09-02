package abstractfactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(boolean bool) {
		if(bool) {
			return new RoundedShapeFactory();
		}else {
			return new ShapeFactory();
		}
	}
}
