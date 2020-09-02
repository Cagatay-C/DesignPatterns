package chainofresponsibility;

public class MultiplyNumbers implements Chain{

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
		
	}

	@Override
	public void calculation(Numbers request) {
		if(request.getCalcWanted().equals("mul")) {
			System.out.println(request.getNumberOne() + " * " + request.getNumberTwo() + " = " + 
					(request.getNumberOne() * request.getNumberTwo()));
		}else {
			System.out.println("Supported only add,subtract,divide and multiply operation");
		}
		
	}	
}
