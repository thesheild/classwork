package gui;

public class MouseCoordinateGame extends GuiApplication {

	//fields
	public static MouseCoordinateGame game;
	public static Screen myScreen;
	
	public MouseCoordinateGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		game = new MouseCoordinateGame(500, 500);

		Thread app = new Thread(game);

		app.start();
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		
	}

}
