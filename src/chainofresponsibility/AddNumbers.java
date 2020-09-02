package chainofresponsibility;

public class AddNumbers implements Chain{
	
	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;
		
	}

	@Override
	public void calculation(Numbers request) {
		if(request.getCalcWanted().equals("add")) {
			System.out.println(request.getNumberOne() + " + " + request.getNumberTwo() + 
					" = " + (request.getNumberOne() + request.getNumberTwo()));
		}else {
			nextInChain.calculation(request);
		}
	}
}
