package algorithmVisualizer;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.SwingUtilities;

public class InsertionSort extends JPanel {
	private static final long serialVersionUID = 1L;
	private final int WIDTH = 1000, HEIGHT= WIDTH * 9/16;

	//creating constructor
	private InsertionSort() {
		setBackground(Color.BLACK);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
	}

	//main method
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("Insertion Sort Visualizer");
			frame.setResizable(false);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setContentPane(new InsertionSort());
			frame.pack();
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		});
	}
}
