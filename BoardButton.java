
// Import required library
import javax.swing.JButton;

public class BoardButton extends JButton {
	
	// Set instance variables
	public int x, y, z;
	
	// Create constructor to set coordinates to instance variables
	public BoardButton(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// Convert coordinates into Cartesian for use with WinChecker
	public int getXCoord() {
		return y;
	}
	
	public int getYCoord() {
		return (3 - x);
	}
	
	public int getZCoord() {
		return (3 - z);
	}
	
}
