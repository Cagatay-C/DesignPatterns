package visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor{
	DecimalFormat df = new DecimalFormat("#.##");
	
	public TaxVisitor() {
		
	}
	
	@Override
	public double visit(Liquor liquor) {
		System.out.println("Liquor item: Price with Tax");
		return (liquor.getPrice() * .32) + liquor.getPrice();
	}

	@Override
	public double visit(Tobacco tobacco) {
		System.out.println("Tobacco item: Price with Tax");
		return (tobacco.getPrice() * .40) + tobacco.getPrice();
	}

	@Override
	public double visit(Necessity necessity) {
		System.out.println("Necessity item: Price with Tax");
		return (necessity.getPrice() * 0) + necessity.getPrice();
	}
}
