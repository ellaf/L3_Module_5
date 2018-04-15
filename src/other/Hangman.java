package other;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Stack;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hangman implements KeyListener{

	JFrame frame = new JFrame("Hangman");
	JPanel panel = new JPanel();
	JLabel textLabel = new JLabel();
	JLabel livesLabel = new JLabel();
	Stack<String> puzzles = new Stack<String>();
	String word = "";
	String hidden = "";
	String solving = "";
	int a = 9;
	
	
	
	public static void main(String[] args) {
	
	Hangman hangman = new Hangman();
	hangman.setup();
		
	}
	void addPuzzles() {
		
		puzzles.add("librarian");
		puzzles.add("justification");
		puzzles.add("retaliation");	
		puzzles.add("inflation");
		puzzles.add("metallurgy");
			
		}
		
		void newPuzzle() {
		
		hidden = "";
		solving = "";
		word = puzzles.pop();
		int length = word.length();
		for (int i = 0; i < length; i++) {
		hidden += "_";
		hidden += " ";
		solving += "_ ";
		textLabel.setText(hidden);
		livesLabel.setText(a + "");
		livesLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

		}

		}
	
	void setup() {

	addPuzzles();
	newPuzzle();
	
	frame.setSize(200, 100);
	frame.addKeyListener(this);
	//System.out.println(hidden);
	panel.add(textLabel);
	panel.add(livesLabel);
	frame.add(panel);
	frame.setVisible(true);	
	
	
	}
	
	public void playDeathKnell() { try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/GoogleDrive/league-sounds/funeral-march.wav"));
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream); clip.start(); Thread.sleep(8400);
		} catch (Exception ex) { ex.printStackTrace();
		} }

	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		boolean f = true;
	for (int i = 0; i < word.length(); i++) {
		char m = word.charAt(i);
		char b = solving.charAt(i*2);
		if(word.charAt(i) == e.getKeyChar()) {
		f = false;
		String bean = solving.substring(0, (i*2));
		String bean2 = solving.substring((i*2)+1, solving.length());
		String bean3 = bean + m + bean2;
		solving = bean3;
		System.out.println("yay!");
		System.out.println(solving);
		
		}
	}
	if(f) {
	a -= 1;
	}
	if(a <= 0) {
	newPuzzle();
	JOptionPane.showMessageDialog(null, "You ran out of lives! Moving to the next puzzle.");
	a = 9;
	playDeathKnell();
	}
	livesLabel.setText(a+"");
	textLabel.setText(solving);
	if(solving.contains("_")) {
		
	}else{
	
	newPuzzle();
	JOptionPane.showMessageDialog(null, "Congratulations! You solved the puzzle!");
	}

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
