package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextLabel extends Component {

	//fields
	private String text;
	private String font;
	private int size;
	
	public TextLabel(int x, int y, int w, int h, String text) {
		super(x, y, w, h);
		this.text=text;
		this.font="Helvetica";
		this.size=20;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.setFont(new Font(font,Font.PLAIN,size));
		if(text!=null) g.drawString(text,4,getHeight()-5);
		
	}

}
