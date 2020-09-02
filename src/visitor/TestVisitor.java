package visitor;

import java.text.DecimalFormat;

public class TestVisitor {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##");
		
		TaxVisitor taxCalc = new TaxVisitor();
		
		Liquor liquor = new Liquor(5.2);
		Tobacco tobacco = new Tobacco(2.30);
		Necessity milk = new Necessity(2.70);
		
		System.out.println(df.format(milk.accept(taxCalc)));
		System.out.println(df.format(tobacco.accept(taxCalc)));
		System.out.println(df.format(liquor.accept(taxCalc)));
	}

}
