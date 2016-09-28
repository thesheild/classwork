package chatBox;

public class School implements Topic {
	
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	public School(){
		
	}
	
	public void talk() {
		inSchoolLoop = true;
		while (inSchoolLoop){
			Anna.print("Tell me about school.");
			schoolResponse = Anna.getInput();
			if(schoolResponse.indexOf("school")>=0){
				inSchoolLoop = false;
				Anna.talkForever();
			}
			else{
			Anna.print("That's my favorite part of school too!");
			}
		}
	}

	public boolean isTriggered(String userInput) {
		String[] triggers = {"school", "class", "teacher"};
		if (Anna.findKeyword(userInput, "school", 0)>=0){
			return true;
		}
		if (Anna.findKeyword(userInput, "class", 0)>=0){
			return true;
		}
		return false;
	}
}
