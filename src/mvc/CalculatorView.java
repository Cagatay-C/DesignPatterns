package mvc;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame{
	
	private JTextField firstNumber = new JTextField(10);
	private JTextField secondNumber = new JTextField(10);
	private JLabel calcLabel = new JLabel("+");
	private JButton calcBut = new JButton("calculate");
	private JTextField calcSolution = new JTextField(10);
	
	CalculatorView(){
		this.setSize(600, 200);
		this.setTitle("Calculator");
		
		
		JPanel panel = new JPanel();
		panel.add(firstNumber);
		panel.add(calcLabel);
		panel.add(secondNumber);
		panel.add(calcBut);
		panel.add(calcSolution);
		this.add(panel);
	
		this.setVisible(true);	
	}
	
	public int getNumberOne() {
		return Integer.parseInt(firstNumber.getText());
	}
	
	public int getNumberTwo() {
		return Integer.parseInt(secondNumber.getText());
	}
	
	public int getCalcValue() {
		return Integer.parseInt(calcSolution.getText());
	}
	
	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}
	
	void addCalculationListener(ActionListener listener) {
		calcBut.addActionListener(listener);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}

}
