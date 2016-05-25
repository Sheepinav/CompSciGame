
// Import required libraries
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame implements ActionListener {
	
	// Declare private variables
	private JButton resetButton;
	private Container window = getContentPane();
	private Graphics g;
	private JLabel scoreBoard;
	private int xScore = 0;
	private int oScore = 0;
	
	// The 'main' method will create the GUI
	public static void main(String[] args) {
		Main frame = new Main();
		
		frame.createMenu();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setTitle("4-D Tic-Tac-Toe");
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
