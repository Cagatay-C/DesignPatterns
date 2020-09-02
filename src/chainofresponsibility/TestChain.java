package chainofresponsibility;

public class TestChain {

	public static void main(String[] args) {
		
		Chain chainOne = new AddNumbers();
		Chain chainTwo = new SubtractNumbers();
		Chain chainThree = new DivideNumbers();
		Chain chainFour = new MultiplyNumbers();
		
		chainOne.setNextChain(chainTwo);
		chainTwo.setNextChain(chainThree);
		chainThree.setNextChain(chainFour);
		
		Numbers nums = new Numbers(2,2,"pow");
		chainOne.calculation(nums);
		
		
		

	}

}
