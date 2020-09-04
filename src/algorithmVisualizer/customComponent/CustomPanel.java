package algorithmVisualizer.customComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JPanel;


public class CustomPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	protected int CUSTOM_PANEL_WIDTH;
	protected int CUSTOM_PANEL_HEIGHT;
	
	public CustomPanel(Rectangle rect) {
		CUSTOM_PANEL_WIDTH = rect.width;
		CUSTOM_PANEL_HEIGHT = rect.height;
		
		setBounds(rect);
		setLayout(null);
		setBackground(Color.BLACK);
		
	}
	
	public CustomPanel(Dimension dim) {
		this(new Rectangle(0, 0, dim.width, dim.height));
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(CUSTOM_PANEL_WIDTH, CUSTOM_PANEL_HEIGHT);
	}
}
