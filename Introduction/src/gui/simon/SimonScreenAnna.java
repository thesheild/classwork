package gui.simon;

import java.util.ArrayList;
import java.util.List;

import gui.ClickableScreen;
import gui.WackAMole.MoleInterface;
import gui.components.TextLabel;
import gui.components.Visible;

public class SimonScreenAnna extends ClickableScreen implements Runnable {

	private TextLabel a;
	private ButtonInterfaceAnna[] b;
	private ProgressInterfaceAnna c;
	private ArrayList<MoveInterfaceAnna> d;
	
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	public SimonScreenAnna(int width, int height) {
		super(width, height);
//		super(); maybe??
		Thread app = new Thread(this);
		app.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		addButtons();
		progress = getProgress();
		a = new TextLabel(130,230,300,40,"Let's play Simon!");
		d = new ArrayList<MoveInterfaceAnna>();
		//add 2 moves to start
		lastSelectedButton = -1;
		d.add(randomMove());
		d.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);
	}
	
	private MoleInterface randomMove() {
		int x = (int)(Math.random()*)
		ButtonInterfaceAnna b;
		return null;
	}

	//Placeholder until partner finishes implementation of ProgressInterface
	private Object getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		// TODO Auto-generated method stub
		
	}

}
