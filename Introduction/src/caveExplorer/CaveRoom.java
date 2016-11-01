package caveExplorer;

public class CaveRoom {
	
	public CaveRoom(String description) {
		// TODO Auto-generated constructor stub
	}
	//final means never changes
	//constants and all caps
	//ex. Math.PI
	public static final int NORTH = 0;
	public static final int EAST = 1;
	public static final int SOUTH = 2;
	public static final int WEST = 3;
	
	private String description;
	private String directions;
	private String contents;
	private String defaultContents;
	
	private CaveRoom[] borderingRooms;
	private Door[] doors;
	
	//sets up cave for when entered
	public void enter() {
		
	}
}
