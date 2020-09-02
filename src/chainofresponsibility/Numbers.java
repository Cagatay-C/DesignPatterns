package chainofresponsibility;

public class Numbers {
	
	private int numberOne;
	private int numberTwo;
	
	private String calcWanted;
	
	public Numbers(int numOne, int numTwo, String calcWanted) {
		numberOne = numOne;
		numberTwo = numTwo;
		this.calcWanted = calcWanted;
	}
	
	public int getNumberOne() {
		return this.numberOne;
	}
	
	public int getNumberTwo() {
		return this.numberTwo;
	}
	
	public String getCalcWanted() {
		return this.calcWanted;
	}

}
