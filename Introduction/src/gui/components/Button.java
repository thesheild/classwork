package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Button extends TextLabel implements Clickable{

	private Color color;
	private Action action;

	public Button(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text);
		color = this.color;
		action = this.action;
		isHovered(x,y);
		update();
	}
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.pink);
		g.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
		g.setColor(Color.red);
		g.drawRoundRect(0, 0, getWidth(), getHeight(), 30, 30);
		g.setFont(new Font(getFont(),Font.PLAIN,getSize()));
		//g.setColor(Color.blue);
		FontMetrics fm = g.getFontMetrics(); 
		if(getText()!=null) g.drawString(getText(),4,getHeight()-5);

	}
	@Override
	public boolean isHovered(int x, int y) {
		if(x<=getWidth() && x>=0)
		{
			
			if(y<=getHeight() && x>=0)
			{
				return true;
			}
		}
		return false;
		}
	@Override
	public void act() {
		act();
	}

}
