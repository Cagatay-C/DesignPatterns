package mvc;

public class CalculatorModel {
	
	private int calcResult;
	
	public void addTwoNumbers(int numOne, int numTwo) {
		calcResult = numOne + numTwo;
	}
	
	public int getCalcValue() {
		return calcResult;
	}
}
