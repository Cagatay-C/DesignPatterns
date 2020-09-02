package interpreter;

public class AndExpression implements Expression{
	
	private Expression expOne = null;
	private Expression expTwo = null;
	
	public AndExpression(Expression expOne, Expression expTwo) {
		this.expOne = expOne;
		this.expTwo = expTwo;
	}

	@Override
	public boolean interpret(String context) {
		return expOne.interpret(context) && expTwo.interpret(context);
	}

}
