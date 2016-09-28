package chatBox;

public class AnnaLikes implements Topic{

	private boolean inLikeLoop;
	private String likeResponse;
	
	
	public void talk() {
		// TODO Auto-generated method stub
		Anna.print("What things do you like?");
		inLikeLoop = true;
		while (inLikeLoop){
			likeResponse = Anna.getInput();
			int likePsn = Anna.findKeyword(likeResponse,"like",0);
			if(likePsn>=0){
				String thingsLiked = likeResponse.substring(likePsn+5);
				Anna.print("You are such an interesting person because you like " +thingsLiked);
				if (Anna.findKeyword(thingsLiked, "school", 0)>=0){
					inLikeLoop = false;
					Anna.school.talk();
				}
				else{
					inLikeLoop = false;
					Anna.talkForever();
				}
				
			}
			else{
				Anna.print("I don't understand you");
			}
		}
	}
	public boolean isTriggered(String userInput) {
		String[] triggers = {"school", "class", "teacher"};
		if (Anna.findKeyword(userInput, "like", 0)>=0){
			return true;
		}
		return false;
	}

}
