package algorithmVisualizer.customComponent;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class CustomButton extends JButton{
	
	private static final long serialVersionUID = 1L;
	
	protected int CUSTOM_BUTTON_WIDTH;
	protected int CUSTOM_BUTTON_HEIGHT;
	
	public CustomButton(Rectangle rect, 
						AbstractAction action, 
						ImageIcon enabled_icon,
						ImageIcon disabled_icon,
						String text, 
						String tooltip) {
		
		CUSTOM_BUTTON_WIDTH = rect.width;
		CUSTOM_BUTTON_HEIGHT = rect.height;
		
		setBounds(rect);
		setAction(action);
		setIcon(enabled_icon);
		setDisabledIcon(disabled_icon);
		setText(text);
		setToolTipText(tooltip);
		
		setOpaque(true);
		setForeground(Color.WHITE);
		setContentAreaFilled(false);
		setHorizontalAlignment(JButton.CENTER);
		setVerticalAlignment(JButton.CENTER);
		setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
	}
	
	
	public CustomButton(Rectangle rect, 
						AbstractAction action, 
						ImageIcon enabled_icon,
						ImageIcon disabled_icon,
						String tooltip) {
		
		this(rect, action, enabled_icon, disabled_icon, "", tooltip);
	}
	
	
	public CustomButton(Rectangle rect, 
						AbstractAction action, 
						ImageIcon enabled_icon,
						String tooltip) {
		this(rect, action, enabled_icon, null, "", tooltip);
	}
	
	public CustomButton(Rectangle rect, AbstractAction action, String text) {
		this(rect, action, null, null, text, "");
	}
	
	@Override 
	public Dimension getPreferredSize() {
		return new Dimension(CUSTOM_BUTTON_WIDTH, CUSTOM_BUTTON_HEIGHT);
	}
}
