package caveExplorer;


public class Inventory {
	private boolean hasMap;
	private String map;
	public Inventory(){
		hasMap = false;
		updateMap();
	}
	public void updateMap() {
		map = " ";
		for(int i=0; i<CaveExplorer.caves[0].length-1; i++){
			map+="____";//4 underscores
		}
		map+="___\n"; //3 underscores and new line
		for(CaveRoom[] row: CaveExplorer.caves){
			//3 rows of text
			for(int i=0; i<3; i++){
				String text = "";
				for(CaveRoom cr: row){
					//this goes in an else statement
					//text+="|";
					if(cr.getDoor(CaveRoom.WEST) != null && cr.getDoor(CaveRoom.WEST).isOpen()){
						text += " ";
					}
					if(i==0){
						text+= "___"; //3 spaces
					}
					else if(i==1){
						text+= " " + cr.getContents() + " ";
					}
					else if (i==2){
						if(cr.getDoor(CaveRoom.SOUTH)!=null && cr.getDoor(CaveRoom.SOUTH).isOpen()){
							text+="   "; //3 spaces
						}
						else{
							text+="___";//3 horizontal lines
						}
					}
				}//last cave room in the row
				text+="|";
				map+= text+"\n";
			}//last of the 3 text lines
		}//last row
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
