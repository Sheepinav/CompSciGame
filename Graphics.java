package testtactoe;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// I know you did an applet
// it's easier to just do a panel, test in a form
// then throw it in an applet later
public class ThreeTic extends JPanel implements ActionListener {
	public static final int PANELS = 4;
	
	private SingleBoard [] boards = new SingleBoard[PANELS];
	private char currentPlayer = 'X';  
	
	// want to store some extra data in our button
	// so we can access it later
	
	class BoardButton extends JButton {
		public int row, col, plane;
		public BoardButton(int row, int col, int plane) {
			this.row = (row);
			this.col = (col);
			this.plane = (plane);
			this.setText("   ");
		}
		public int toCol(){
			return col;	
		}
		public int toRow(){
			return row;	
		}
		public void toPlane(){
			System.out.println(plane);	
		}
		public String toString() {
			return "(" + row + "," + col + "," + plane + ") = " + this.getText();
			
		}
	}
	
	// A panel for rows and cols
	class SingleBoard extends JPanel {
		public static final int ROWS = 4;
		public static final int COLS = 4;
		
		// I hate 2d arrays
		private BoardButton [] items = new BoardButton[ROWS*COLS];  
		public SingleBoard(int plane, ActionListener listener) {
			setLayout( new GridLayout( ROWS, COLS ) );
			for (int row=0; row<ROWS; row++) {
				for (int col=0; col<COLS; col++) {
					BoardButton b = new BoardButton(3-row, col, 3-plane);
					b.addActionListener(listener);
					Icon i = new ImageIcon("1.png");
					b.setIcon(i);
					add(b );
					items[(row)*COLS+(col)] = b;
				}
			}
		}
		
		// at this level, allow a button value to be changed
		// given a row and col
		// see, you never need 2d arrays
		public char getValue(int row, int col) {
			String s = items[row*COLS+col].getText();
			return (s==null || s.length()==0) ? ' ' : s.charAt(0);
		}
		
		public void setValue(int row, int col, char val) {
			items[row*COLS+col].setText(String.valueOf(val));
		}

	}
	
	
	public ThreeTic() {
		// now we just place the boards
		setLayout( new GridLayout( 4, 1, 10, 10 ) );
		for(int panel=0; panel<PANELS; panel++) {
			SingleBoard sb = new SingleBoard(panel, this);
			boards[panel] = sb;
			add(sb);
		}
	}
	
	// we can get and set knowing a panel number
	// the let the panel method do the work
	public char getValue(int row, int col, int plane) {
		return boards[plane].getValue(row, col);
	}

	public void setValue(int row, int col, int plane, char val) {
		boards[plane].setValue(row, col, val);
	}

	
	public void actionPerformed(ActionEvent kayfequ) {
		BoardButton b = (BoardButton)kayfequ.getSource();
		// we could set this directly
		// but we want to validate through setValue
		//b.setText("X");
		setValue(b.row, b.col, b.plane, currentPlayer);
		b.setEnabled(false);
		currentPlayer = (currentPlayer=='X') ? 'O' : 'X';
		System.out.println(b );
	//b.setBackground(KFQFace.png);
	Icon d = new ImageIcon("SnoopDoggyDogg.png");
	b.setIcon(d);
	//System.out.println(kayfequ.getSource());
		}
	 
	public static void test() {
		JFrame frm = new JFrame("Layout Test"); 
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.getContentPane().setLayout(new BorderLayout());
		frm.getContentPane().add(new ThreeTic(), BorderLayout.CENTER);
		frm.pack();
		frm.setVisible(true);
	}
	

	//creates data board for technical use
	public int[][][] gameBoard= new int[4][4][4];
	}
