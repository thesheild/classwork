package caveExplorer;


public class Inventory {
	private boolean hasMap;
	private String map;
	public Inventory(){
		hasMap = true;
		updateMap();
	}
	private void updateMap() {
		// TODO Auto-generated method stub
		
	}
	public boolean isHasMap() {
		return hasMap;
	}
	public void setHasMap(boolean hasMap) {
		this.hasMap = hasMap;
	}
	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public String getDescription(){
		if(hasMap){
			return map;
		}
		else{
			return "There is nothing in your inventory";
		}
	}
}
