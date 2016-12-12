package gui;

import java.awt.Graphics;

import javax.swing.JFrame;

public class GuiApplication extends JFrame{

	//FIELDS
	private Screen currentScreen;
	
	//demo purposes only
	public static void main(String[] args){
		new GuiApplication(800,600);
	}
	public GuiApplication(int width, int height) {
		super();
		setBounds(20,20,width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initScreen();
		setVisible(true);
	}
	public void initScreen() {
		currentScreen=new Screen(getWidth(),getHeight());
	}
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
}
