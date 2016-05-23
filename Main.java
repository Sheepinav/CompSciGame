
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener {
	
	private JButton resetButton;
	private Container window = getContentPane();
	private Graphics g;
	
	public static void main(String[] args) {
		Main frame = new Main();
		
		frame.createMenu();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setTitle("4-D Tic-Tac-Toe");
	}
	
	private void createMenu() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setResizable(false);
		
		window.setLayout(new BorderLayout());
		
		resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		
		window.add(resetButton, BorderLayout.WEST);
		g = new Graphics();
		window.add(g, BorderLayout.EAST);
		
		pack();
	}

	public void actionPerformed(ActionEvent e) {
		window.remove(g);
		g = new Graphics();
		window.add(g, BorderLayout.EAST);
		pack();
	}
	
}
