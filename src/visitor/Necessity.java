package visitor;

public class Necessity implements Visitable{
	
	private double price;
	
	Necessity(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);	
	}
}
