package gui.sampleGames;

import gui.GuiApplication;
import gui.MovementScreen;
import gui.Screen;
import gui.screens.CoordinateScreen;

public class MouseFollower extends GuiApplication {

	public static MouseFollower game;//only ONE exists
	public static CoordinateScreen coordScreen;
	public static MovementScreen movementScreen;
	

	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void initScreen() {
		movementScreen = new MovementScreen(getWidth(), getHeight());
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}

	public static void main(String[] args) {
		game = new MouseFollower(800,600);
		Thread app = new Thread(game);
		app.start();
	}

}
