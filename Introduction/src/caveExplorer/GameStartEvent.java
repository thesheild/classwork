package caveExplorer;

public class GameStartEvent implements Event {

	public static final String[] SEQ_1 = {
			"A spiky haired guy with orange pants flies up to you.",
			"You arrrived to save us from the treacherous Buu?",
			"We need your help."
	};
	
	public static final String[] SEQ_2 = {
			"Great, I will be busy meditating on my super yellow version while you figure out where Buu is.",
			"Kaaa, maaay..."
	};
	
	public GameStartEvent() {
		// TODO Auto-generated constructor stub
	}

	public void play() {
		readSequence(SEQ_1);
		CaveExplorer.print("Will you help us?");
		while(CaveExplorer.in.nextLine().indexOf("yes")>0){
			CaveExplorer.print("Please say yes, I beg you!");
		}
		readSequence(SEQ_2);
		CaveExplorer.inventory.setHasMap(true);
	}

	private void readSequence(String[] seq) {
		for(String s:seq){
			CaveExplorer.print(s);
			CaveExplorer.print(" - - - Press Enter - - - ");
			CaveExplorer.in.nextLine();
		}
	}

}
