package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	CalculatorModel theModel;
	CalculatorView theView;
	
	public CalculatorController(CalculatorModel theModel, CalculatorView theView) {
		this.theModel = theModel;
		this.theView = theView;
		
		this.theView.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener {
		

		@Override
		public void actionPerformed(ActionEvent e) {
			int firstNumber,secondNumber = 0;
			
			try {
				firstNumber = theView.getNumberOne();
				secondNumber = theView.getNumberTwo();
				theModel.addTwoNumbers(firstNumber, secondNumber);
				theView.setCalcSolution(theModel.getCalcValue());	
			} catch (NumberFormatException e2) {
				theView.displayErrorMessage("You Need to Enter Two Integers");
			}
		}	
	}
}
