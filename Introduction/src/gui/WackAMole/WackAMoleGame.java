package gui.WackAMole;

import gui.GuiApplication;

public class WackAMoleGame extends GuiApplication {
	
	public WackAMoleGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		WackAMoleScreen wams = new WackAMoleScreen (getWidth(), getHeight());
		setScreen(wams);
	}

	public static void main(String[] args) {
		WackAMoleGame wamg = new WackAMoleGame(800,500);
		Thread game = new Thread(wamg);
		
	}

}
