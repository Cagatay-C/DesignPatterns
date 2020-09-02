package interpreter;

public class OrExpression implements Expression{

	Expression expOne = null;
	Expression expTwo = null;
	
	public OrExpression(Expression expOne, Expression expTwo) {
		this.expOne = expOne;
		this.expTwo = expTwo;
	}
	
	
	@Override
	public boolean interpret(String context) {
		return expOne.interpret(context) || expTwo.interpret(context);
	}
}
