package algorithmVisualizer.customComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CustomLabel extends JLabel{

	private static final long serialVersionUID = 1L;
	
	protected int CUSTOM_LABEL_WIDTH;
	protected int CUSTOM_LABEL_HEIGHT;
	
	public CustomLabel(Rectangle rect, ImageIcon icon, String text) {
		this.CUSTOM_LABEL_WIDTH = rect.width;
		this.CUSTOM_LABEL_HEIGHT = rect.height;
		
		setBounds(rect);
		setIcon(icon);
		setText(text);
		
		setOpaque(false);
		setForeground(Color.WHITE);
		setHorizontalAlignment(JLabel.CENTER);
		setVerticalAlignment(JLabel.CENTER);
		
	}
	
	public CustomLabel(Rectangle rect, ImageIcon icon) {
		this(rect, icon, "");
	}
	
	public CustomLabel(Rectangle rect, String text, Font font) {
		this(rect, null, text);
		setFont(font);
	}
	
	public CustomLabel(Rectangle rect, String text) {
		this(rect, null, text);
	}
	
	public CustomLabel(Rectangle rect) {
		this(rect, null, "");
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(this.CUSTOM_LABEL_WIDTH, this.CUSTOM_LABEL_HEIGHT);
	}
}
