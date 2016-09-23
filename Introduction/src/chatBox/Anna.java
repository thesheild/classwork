package chatBox;

import java.util.Scanner;

public class Anna {

	static Scanner input;
	static String user;
	//static int lineCount;
	static boolean inLoop;
	static String response;
	static Topic school;
	
	public static void main (String[] args){
		createTopic();
		//lineCount = 0;
		//demonstrateStringMethods();
		promptName();
		talkForever();
	}
	
	private static void promptName() {
		print("Hello human! I am a board covered with semi conductors and other such electronic components. What is your name?");
		user = input.nextLine();
		print("Awesome, I will call you " + user + " until you terminate me!");
	}

	public static void talkForever(){
		inLoop = true;
		while(inLoop){
				print("Greetings, " + user + ". How are you doing?");
				response = getInput(); 
				if (response.indexOf("good")>0){
					print("I'm so happy you're good");
				}
				else if(response.indexOf("school") >=0 ) {
					inLoop = false;
					school.talk();
				}
		}
	}
	
	private static void promptInput() {
		print(user + ", try inputing a String!");
		String userInput = input.nextLine();
		print("You typed:" +userInput);
	}
	
	public static String getInput(){
		return input.nextLine();
	}
	
	public static void print(String s){
		//create a multi line string
		String printString = "";
		int cuttoff = 35;
		//check to see if there's words to add
		//
		while(s.length()>0){
			String currentLine="";
			String nextWord="";
			//while the current line and next word are less than the cuttoff, do the following loop AND there are still words to add
			while(currentLine.length() + nextWord.length() <= cuttoff && s.length() > 0){
				//add the next word to the line
				currentLine += nextWord;
				//remove that word
				s = s.substring(nextWord.length());
				// get the following word 
				int endOfWord = s.indexOf(" ");
				//check to see if this i the last word
				if (endOfWord==-1){
					endOfWord = s.length()-1;
				}
				// get the next word and space
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += currentLine + "\n";
		}
		
		System.out.println(printString);
	}
	
	private static void createTopic() {
		input = new Scanner(System.in);
		school = new School();
	}
	
	public static void demonstrateStringMethods(){
//			String text = new String("Hello World");
			String text1 = "Hello World"; //same as above
			String text2 = "Hello ";
			String text3 = "World";
			
			if(text1 .equals (text2 + text3)) System.out.println("these strings are equal");
			
			System.out.println(text1);
			System.out.println(text2+text3);
			
			String word1 = "aardvark";
			String word2 = "zyzzyva";
			if (word1.compareTo(word2)<0) System.out.println("word1 is before word2 " + "lex");
	}

}