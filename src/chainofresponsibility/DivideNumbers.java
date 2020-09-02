package chainofresponsibility;

public class DivideNumbers implements Chain{

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		nextInChain = nextChain;
		
	}

	@Override
	public void calculation(Numbers request) {
		if(request.getCalcWanted().equals("div")) {
			System.out.println(request.getNumberOne() + " / " + request.getNumberTwo() + " = " + 
					(request.getNumberOne() / request.getNumberTwo()));
		}else {
			nextInChain.calculation(request);
		}
	}	
}
