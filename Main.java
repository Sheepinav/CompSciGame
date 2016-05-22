
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		// Create the graphics
		Graphics g = new Graphics();
		
		// Set the features of the window
		JFrame frm = new JFrame("4D Tic-Tac-Toe"); 
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(new BorderLayout());
		frm.getContentPane().add(new Graphics(), BorderLayout.CENTER);
		frm.pack();
		frm.setLocationRelativeTo(null);
		frm.setResizable(false);
		frm.setVisible(true);
		
	}

}
