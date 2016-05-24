
// Import required libraries
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class Board2D extends JPanel {
	
	// Set static variables for row and column size
	public static final int ROWS = 4;
	public static final int COLUMNS = 4;
	
	public BoardButton[][] buttonArray = new BoardButton[4][4];
	
	// Create 2D array of buttons
	public Board2D(int plane, ActionListener al) {
		setLayout(new GridLayout(ROWS, COLUMNS));
		
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLUMNS; col++) {
				BoardButton button = new BoardButton(row, col, plane);
				button.addActionListener(al);
				button.setPreferredSize(new Dimension(40, 40));
				add(button);
				buttonArray[row][col] = button;
			}
		}
	}
	
}
