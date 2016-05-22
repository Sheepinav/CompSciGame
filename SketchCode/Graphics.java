
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Graphics extends JPanel implements ActionListener {
	
	public static final int PLANES = 4;
	public final ImageIcon xImage = new ImageIcon("x_image.jpg");
	public final ImageIcon oImage = new ImageIcon("o_image.jpg");
	private int currentPlayer = 1;
	private int winState = 0;
	WinChecker gameChecker = new WinChecker();
	
	private Board2D[] gameBoard = new Board2D[PLANES];
	
	public Graphics() {
		setLayout(new GridLayout(PLANES, 1, 0, 10));
		
		for (int plane = 0; plane < PLANES; plane++) {
			Board2D board = new Board2D(plane, this);
			gameBoard[plane] = board;
			add(board);
		}
	}
	
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
		
		// Check for wins (needs work/cleaning up)
		winState = gameChecker.checkColWin(x, y, z);
		if (winState != 0)
			System.out.println("Someone won!");
		winState = gameChecker.checkRowWin(x, y, z);
		if (winState != 0)
			System.out.println("Someone won!");
		winState = gameChecker.checkPlaneWin(x, y, z);
		if (winState != 0)
			System.out.println("Someone won!");
		winState = gameChecker.checkDiagonal();
		if (winState != 0)
			System.out.println("Someone won!");
		
		button.setEnabled(false);
		
		currentPlayer = (currentPlayer == 1) ? -1 : 1;
	}
	
}
