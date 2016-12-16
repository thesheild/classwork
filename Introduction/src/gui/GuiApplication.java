package gui;

import java.awt.Graphics;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public abstract class GuiApplication extends JFrame implements Runnable{

	//FIELDS
	private Screen currentScreen;
	
	public GuiApplication(int width, int height) {
		super();
		setBounds(20,20,width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initScreen();
		setVisible(true);
	}
	public abstract void initScreen();
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void setScreen(Screen s){
		//stop listening to prev screen 
		if(currentScreen != null){
			MouseListener ml = currentScreen.getMouseListener();
			if(ml != null) removeMouseListener; 
		}
		currentScreen = s;
		//start listening to new screen
		if(currentScreen !=null){
			addMouseListener(currentScreen.getMouseListener());
			addMouseMotionListener(currentScreen.getMouseMotionListener());
		}
	}
	
	public void run(){
		while(true){
			//redraws the display
			currentScreen.update();
			//update the window
			repaint();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
