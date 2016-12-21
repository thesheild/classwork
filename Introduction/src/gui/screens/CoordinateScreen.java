package gui.screens;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gui.MouseCoordinateGame;
import gui.Screen;
import gui.components.Action;
import gui.components.Button;
import gui.components.Graphic;
import gui.components.TextArea;
import gui.components.TextLabel;
import gui.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{

	//FIELD
		private Button button;
		private TextLabel text;
		private TextArea area;
		private Graphic bowser;
		
		public CoordinateScreen(int width, int height) {
			super(width, height);
		}

		@Override
		public void initObjects(ArrayList<Visible> viewObjects) {
			button = new Button(20,100,80,40,
					"The Button with a long name",new Color(100,100,250),
					new Action() {
				
				public void act() {
					MouseCoordinateGame.game.setScreen(MouseCoordinateGame.myScreen);
				}
			});
			viewObjects.add(button);
			text = 
					new TextLabel(20, 100, 500, 40, "Some text");
			viewObjects.add(text);
			area = 
					new TextArea(20, 200, 500, 100, "This is a really long text. It prints over mulitple lines, as you can see. We worked on this in class. It is called text area.");
			viewObjects.add(area);
			
			bowser = new Graphic(30,30, .5,"resources/sampleImages/Supergirl.png");
			viewObjects.add(bowser);
		}

		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseMoved(MouseEvent e) {
			int mx = e.getX();//get mouse X coordinate
			int my = e. getY();//get Y coord
			text.setText("Mouse at: "+mx +", "+my);
		}

		public MouseMotionListener getMouseMotionListener(){ 
			return this;
		}
		
		public MouseListener getMouseListener(){
			return this;
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

}
