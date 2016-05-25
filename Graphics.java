
// Import required libraries
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Graphics extends JPanel implements ActionListener {
	
	// Declare variables and create 'gameChecker' object
	public static final int PLANES = 4;
	public final ImageIcon xImage = new ImageIcon("x_image.jpg");
	public final ImageIcon oImage = new ImageIcon("o_image.jpg");
	private int currentPlayer = 1;
	private int XWin = 0;
	private int OWin = 0;
	WinChecker gameChecker = new WinChecker();
	
	private Board2D[] gameBoard = new Board2D[PLANES];
	
	// 'Graphics' constructor will create the four 'Board2D' objects 
	public Graphics() {
		setLayout(new GridLayout(PLANES, 1, 0, 10));
		
		for (int plane = 0; plane < PLANES; plane++) {
			Board2D board = new Board2D(plane, this);
			gameBoard[plane] = board;
			add(board);
		}
	}
	
	// 'actionPerformed' executes code on each button pressed
	public void actionPerformed(ActionEvent e) {
		// Get the button that was pressed
		BoardButton button = (BoardButton) e.getSource();
		
		// Get X, Y, and Z coordinates of the pressed button object
		int x = button.getXCoord();
		int y = button.getYCoord();
		int z = button.getZCoord();
		
		// Set the image of the button to an 'X' or 'O' depending on player
		if (currentPlayer == 1)
			button.setIcon(xImage);
		else
			button.setIcon(oImage);
		
		// Feed the value of 'currentPlayer' into 'hiddenArray'
		gameChecker.setValue(x, y, z, currentPlayer);
		
		if (gameChecker.checkwin(x, y, z) == 1)
			System.out.println("X wins");
		else if (gameChecker.checkwin(x, y, z) == -1)
			System.out.println("O wins");
		
		// Disable the pressed button
		button.setEnabled(false);
		
		// If a win is detected, disable all the buttons
		if (gameChecker.getWinState() != 0) {
			for (int plane = 0; plane < PLANES; plane++) {
				for (int row = 0; row < Board2D.ROWS; row++) {
					for (int col = 0; col < Board2D.COLUMNS; col++) {
						gameBoard[plane].buttonArray[row][col].setEnabled(false);
					}
				}
			}
			
			if (gameChecker.getWinState() == 1) {
				XWin++;
			} else {
				OWin++;
			}
		}
		
		// Flip the current player
		currentPlayer = (currentPlayer == 1) ? -1 : 1;
	}
	
	public int returnXWin() {
		return XWin;
	}
	
	public int returnOWin() {
		return OWin;
	}
	
}
