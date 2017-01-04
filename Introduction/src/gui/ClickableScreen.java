package gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import gui.components.Clickable;
import gui.components.Visible;

public abstract class ClickableScreen extends Screen implements MouseListener {
	
	private ArrayList<Clickable> clickables;

	public ClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		initAllObjects(viewObjects);
		clickables = new ArrayList<Clickable>();
		for(Visible v: viewObjects){
			if(v instanceof Clickable){
				clickables.add((Clickable)v);
			}
		}
	}

	public abstract void initAllObjects(List<Visible> viewObjects);

	 public void addObject(Visible v){
		 super.addObject(v);
		 if(v instanceof Clickable){
		 clickables.add((Clickable)v);
		 }
	 }
		 

		 
	public void remove(Visible v){
		 super.remove(v);
		 clickables.remove((Clickable)v);
	} 
}
