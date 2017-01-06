package gui.WackAMole;

import java.util.ArrayList;
import java.util.List;

import gui.ClickableScreen;
import gui.components.Action;
import gui.components.TextLabel;
import gui.components.Visible;

public class WackAMoleScreen extends ClickableScreen implements Runnable {

	 private ArrayList<MoleInterface> moles;
	 private PlayerInterface player;
	 private TextLabel label;
	 private TextLabel timeLabel;
	 private double timeLeft;
	
	public WackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		//when making simon, creating a thread like this
		//is necessary since simons screen changes
		Thread play = new Thread(this);
		play.start();
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		moles = new ArrayList<MoleInterface>();
		player = getAPlayer();
		label = new TextLabel(350,220,100,40,"");
		timeLabel = new TextLabel (360,40,80,40,"30.0");
		//viewObjects.add(player);
		viewObjects.add(timeLabel);
		viewObjects.add(label);
	}
	
	//This method is a placeholder until our partner finishes the desiign of players
	//for the time being, it returns null
	//this means our code wont work until our partner is done BUT at least our code will compile
	//DONT FORGET TO CHANGE THIS ONCE YOUR PARTNER IS DONE
	public PlayerInterface getAPlayer(){
		return new Player();
		
	}
	
	public MoleInterface getAMole(){
		return new Mole((int)(Math.random() * getWidth()), ((int)(Math.random() * getHeight())));
		
	}
	

	public void run(){
		changeText("Ready...");
		changeText("Set...");
		changeText("Go...");
		label.setText("");
		//since this is a timed game, we will use a while loop
		//this is not necessary for games that arent timed
		while(timeLeft>0){
			updateTimer();
			updateAllMoles();
			appearNewMole();
			
		}
	}

	private void appearNewMole() {
		double chance = .2*(60-timeLeft)/60;
		if(Math.random()<chance){
			final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int)(500 + Math.random()*2000));
			//tell the mole what to do when clicked
			mole.setAction(new Action(){

				@Override
				public void act() {
					player.increaseScore(1);
					remove(mole);
					moles.remove(mole);
				}
				
			});
			addObject(mole);
			moles.add(mole);
		}
	}

	private void updateAllMoles() {
		for(int i = 0; i<moles.size(); i++){
			MoleInterface m = moles.get(i);
			int screenTime = m.getAppearanceTime()-100;
			m.setAppearanceTime(screenTime);
			if(m.getAppearanceTime()<=0){
				remove(m);//remove from screen
				moles.remove(m);
				i--;//compensate for removal
			}
		}
	}

	private void updateTimer() {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timeLeft -= .1;
		//.1 is not a clean number in binary, so to fix the out put, 
		//we used this little formula to round to the nearest 10th
		timeLabel.setText(""+(int)(timeLeft*10)/10.0);
	}

	//USE THIS METHOD IN SIMON TOO
	private void changeText(String string) {
		label.setText(string);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
