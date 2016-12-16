package gui.screens;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.Screen;
import gui.components.Button;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	//fields
	private Button button;
	private TextLabel text;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
//		button = new Button(20,100,80,40,"The Button", new Color)
		text = 
				new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
				
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		text.setText("Mouse at: " + mx + "," + my);
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return null;
		
	}

}
