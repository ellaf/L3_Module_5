package other;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hangman {

	JFrame frame = new JFrame("Hangman");
	JPanel panel = new JPanel();
	JTextField textField = new JTextField();
	
	public static void main(String[] args) {
	
	Hangman hangman = new Hangman();
	hangman.setup();
	
	}
	
	void setup() {
	
	frame.setSize(200, 100);
	panel.add(textField);
	frame.add(panel);
	frame.setVisible(true);
		
	}
	
}
