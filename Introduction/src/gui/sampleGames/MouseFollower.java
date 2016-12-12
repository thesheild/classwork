package gui.sampleGames;

import gui.GuiApplication;
import gui.screens.CoordinateScreen;

public class MouseFollower extends GuiApplication {

	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	//fields
	private CoordinateScreen cs;
	
	@Override
	public void initScreen() {
		cs = new CoordinateScreen(getWidth(), getHeight());
		setScreen(cs);
	}

	public static void main(String[] args) {
		new MouseFollower(800,600);
	}

}
