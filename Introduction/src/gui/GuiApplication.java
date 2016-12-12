package gui;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GuiApplication extends JFrame{

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
		currentScreen = s;
	}
}
