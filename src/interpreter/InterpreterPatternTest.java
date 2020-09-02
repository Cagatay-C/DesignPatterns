package interpreter;

public class InterpreterPatternTest {
	
	public static Expression getMaleExpression() {
		Expression john = new TerminalExpression("john");
		Expression robert = new TerminalExpression("robert");
		return new OrExpression(john,robert);
	}
	
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("julie");
		Expression married = new TerminalExpression("married");
		return new AndExpression(julie,married);
	}
	
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarried = getMarriedWomanExpression();
		
		System.out.println("robert is male? " + isMale.interpret("robert"));
		System.out.println("Julie is married? " + isMarried.interpret("julie married"));	
	}

}
