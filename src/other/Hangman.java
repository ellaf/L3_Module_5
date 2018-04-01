package other;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hangman implements KeyListener{

	JFrame frame = new JFrame("Hangman");
	JPanel panel = new JPanel();
	JLabel textLabel = new JLabel();
	Stack<String> puzzles = new Stack<String>();
	String word = "";
	String hidden = "";
	String solving = "";
	
	public static void main(String[] args) {
	
	Hangman hangman = new Hangman();
	hangman.setup();
		
	}
	
	void setup() {
	
	puzzles.add("librarian");
	puzzles.add("justification");
	puzzles.add("retaliation");
	frame.setSize(200, 100);
	frame.addKeyListener(this);
	word = puzzles.pop();
	int length = word.length();
	for (int i = 0; i < length; i++) {
	hidden += "_";
	hidden += " ";
	}
	textLabel.setText(hidden);
	System.out.println(hidden);
	panel.add(textLabel);
	frame.add(panel);
	frame.setVisible(true);	
	
	}
	
	void createUI() {
	
	}
	
	void addPuzzles() {
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	for (int i = 0; i < word.length(); i++) {
		//char m = word.charAt(i);
		if(word.charAt(i) == e.getKeyChar()) {
		solving += word.charAt(i);
		}else {
		solving += "_";
		}
		solving += " ";
	}
	textLabel.setText(solving);
	solving = "";
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}
