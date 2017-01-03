package gui;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import gui.components.Visible;

public abstract class Screen {
	
	private BufferedImage image;
	private ArrayList<Visible> viewObjects;
	
	public Screen(int width, int height) {
		viewObjects= new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width,height);
	}
	
	public abstract void initObjects(ArrayList<Visible> viewObjects);
	
	private void initImage(int width, int height) {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}
	
	public BufferedImage getImage(){
		return image;
	}
	
	public int getWidth(){
		return image.getWidth();
	}
	
	public int getHeight(){
		return image.getHeight();
	}
	
	void update() {
		Graphics2D g = image.createGraphics();
		//smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
//		for(int i=0; i<viewObjects.size(); i++){
//		}
		for(int i = 0; i<viewObjects.size(); i++){
			Visible v = viewObjects.get(i);
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
		
		
	}
	public MouseMotionListener getMouseMotionListener(){
		return null;
	}
	
	public MouseListener getMouseListener(){
		return null;
	}
	public void addObject(Visible v) {
		viewObjects.add(v);
	}

	public void remove(Visible v) {
		/*
		 * note: in this implementation, 
		 * we have very simple command: remove(v)
		 * however, remove is a kind of a big deal 
		 * on the AP Exam. here's why:
		 * 
		 * When an object is removed from a list, every 
		 * other object...
		 * 
		 *  Here is a classic example:
		 *  
		 *  the following is WRONG
		 *  Suppose you have a list<interger> with
		 *  (4,8,7,1)
		 *  and you want to remove all intergers greater than 5
		 *  you do this:
		 *  for (int i=0;i<list.size(); i++){
		 *  	if (list.get(i)>5) list.remove(i);
		 *  }
		 *  YOU FAILED!
		 *  
		 *  why do you fail?
		 *  i=0, nothing changes
		 *  i=1, the 8 is removed
		 *  now we have (4,7,1)
		 *  ...
		 *  
		 *  the following is CORRECT:
		 *  1
		 *   for (int i=0;i<list.size(); i++){
		 *  	while (list.get(i)>5) list.remove(i);
		 *  }
		 *  2
		 *  for (int i=0;i<list.size(); i++){
		 *  	if (list.get(i)>5){
		 *  		list.remove(i);
		 *  		i--; //compensate for i++
		 *  	}
		 *  }
		 *  
		 *  one more note:
		 *  if you call list.remove(int)
		 *  it will return the object being removed at that index
		 *  so you can do something like this
		 *  system.out.println(list.remove(0).toString...
		 */
		viewObjects.remove(v);
	}
	
	public void moveToBack(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			//the "back " is index 0
			viewObjects.add(0,v);
			//this moves everything else forward in the list
		}
	}
	
	public void moveToFront(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(v);
		}
	}
	
//you cannot instatiate an abstract class
}
