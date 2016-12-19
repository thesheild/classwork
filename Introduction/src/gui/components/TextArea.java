package gui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
		
	}
	
	@Override
	public void update(Graphics2D g) {
		FontMetrics fm = g.getFontMetrics();
		String[] words = getText().split(" ");
		int indexOfWords = 0;
		int totalLines = getHeight()/fm.getHeight();
		int currentW = 0;
		
		int currentLine = 1;
		while(currentLine <= totalLines){
			for(int i= 0; i<words.length; i++){
				if(words[i].length() + words[i+1].length() < getWidth()){
					//add in the text
				}
			}
			currentLine++;
		}
		
		
		
		
		
		g = clear(); // deletes previous test 
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
				RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setColor(Color.black);
		g.setFont(new Font(getFont(),Font.PLAIN,getSize()));
		if(getText() != null) g.drawString(getText(), 4, getHeight()-5);
		
	}
}
