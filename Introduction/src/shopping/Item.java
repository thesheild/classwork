package shopping;

public class Item {
	
	private String description;
	private boolean purchased;
	
	public Item(String d){
		this.description = d;
		this.purchased = false;
	}
	
	public void setPurchase(boolean b){
		this.purchased = b;
	}
}
