
// Import required libraries
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
	
	// Declare private variables
	private JButton resetButton;
	private Container window = getContentPane();
	private Graphics g;
	private JLabel scoreBoard;
	private int xScore = 0;
	private int oScore = 0;
	
	// The 'main' method will create the GUI
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException {
		Main frame = new Main();
		
		frame.createMenu();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setTitle("3D Tic-Tac-Toe");
		frame.playMusic();
	}
	
	// Method in 'Main' class to create the GUI
	private void createMenu() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setResizable(false);
		
		window.setLayout(new BorderLayout());
		
		resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		window.add(resetButton, BorderLayout.EAST);
		
		g = new Graphics();
		window.add(g, BorderLayout.CENTER);
		
		scoreBoard = new JLabel("X's wins: " + xScore + " | O's wins: " + oScore);
		window.add(scoreBoard, BorderLayout.NORTH);
		
		pack();
	}
	
	private void playMusic() throws UnsupportedAudioFileException, IOException {
		Clip clip;
		File soundFile = new File("something.wav");
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
		
		try { 
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.setFramePosition(0);
			clip.start(); // Plays the audio
		} catch (Exception e) {}
	}
	
	// When the button is pressed, the game should be reset
	public void actionPerformed(ActionEvent e) {
		window.remove(g);
		window.remove(scoreBoard);
		
		xScore += g.returnXWin();
		oScore += g.returnOWin();
		
		scoreBoard = new JLabel("X's wins: " + xScore + " | O's wins: " + oScore);
		window.add(scoreBoard, BorderLayout.NORTH);
		
		g = new Graphics();
		window.add(g, BorderLayout.CENTER);
		pack();
	}
	
}
