package gui.sampleGames;

import gui.GuiApplication;
import gui.screens.CoordinateScreen;

public class MouseFollower extends GuiApplication {

	private static MouseFollower game;//only ONE exists
	private CoordinateScreen cordScreen;
	

	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void initScreen() {
		cordScreen = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cordScreen);
	}

	public static void main(String[] args) {
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}
