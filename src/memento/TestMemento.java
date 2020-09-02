package memento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestMemento extends JFrame{

	public static void main(String[] args) {
		new TestMemento();
	}
	
	private JButton saveBut,undoBut,redoBut;
	private JTextArea theArticle = new JTextArea(40,60);
	
	CareTaker careTaker = new CareTaker();
	Originator originator = new Originator();
	
	int saveFiles = 0, currentArticle = -1;
	
	public TestMemento() {
		this.setSize(750,780);
		this.setTitle("Memento Design Pattern");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JLabel artLabel = new JLabel("Article");
		
		panel.add(artLabel);
		panel.add(theArticle);
		
		ButtonListener saveListener = new ButtonListener();
		ButtonListener undoListener = new ButtonListener();
		ButtonListener redoListener = new ButtonListener();	
		
		saveBut = new JButton("Save");
		saveBut.addActionListener(saveListener);
		
		undoBut = new JButton("Undo");
		undoBut.addActionListener(undoListener);
		undoBut.setEnabled(false);
		
		redoBut = new JButton("Redo");
		redoBut.addActionListener(redoListener);
		redoBut.setEnabled(false);
		
		panel.add(saveBut);
		panel.add(undoBut);
		panel.add(redoBut);
		
		this.add(panel);
		this.setVisible(true);		
		this.setLocationRelativeTo(null);
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == saveBut) {
				String textAreaString = theArticle.getText();
				
				originator.set(textAreaString);
				
				careTaker.addMemento(originator.storeInMemento());
				
				saveFiles++;
				currentArticle++;
				
				System.out.println("Save Files: " + saveFiles);
				undoBut.setEnabled(true);
				
			}else if(e.getSource() == undoBut) {
				if(currentArticle >= 1) {
					currentArticle--;
					String theTextAreaString = originator.restoreFromMemento(careTaker.getMemento(currentArticle));
					theArticle.setText(theTextAreaString);
					undoBut.setEnabled(true);
					redoBut.setEnabled(true);
				}else {
					undoBut.setEnabled(false);
				}
				
				
				
			}else if(e.getSource() == redoBut) {
				if(saveFiles - 1 > currentArticle) {
					currentArticle++;
					String theTextAreaString = originator.restoreFromMemento(careTaker.getMemento(currentArticle));
					theArticle.setText(theTextAreaString);
					undoBut.setEnabled(true);
				}else {
					redoBut.setEnabled(false);
				}
				
			}
			
		}
		
	}

}
