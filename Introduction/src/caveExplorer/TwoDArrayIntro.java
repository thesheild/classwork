package caveExplorer;

//import java.util.Arrays;

import java.util.Scanner;

public class TwoDArrayIntro {
	
	public static String[][] arr2d;
	public static String[][]pic;
	public static int i;
	public static int j;
	public static Scanner in;
	
	public static void main (String[] args){
		//rows, columns
		 arr2d = new String[5][4];
		 pic = new String [5][4];
		//iterate row by row
		for(int row = 0 ; row < arr2d.length; row++){
			// in each row go col by col
			for(int col = 0; col<arr2d[row].length; col++){
				arr2d[row][col]="(" + row + "," + col +")";
			}
		}
		//start positions
		i=2;
		j=3;
		in= new Scanner(System.in);
		startExploring();
		
	}

	private static void startExploring() {
		while(true){
			for(int i=0; i<pic.length; i++){
				
			}
			Practice.printPic(pic);
			System.out.println("You are in room "+ arr2d[i][j]);
			System.out.println("What do you want to do");
			String input = in.nextLine();
			while(!isValid(input)){
				System.out.println("Please enter w a s or d.");
				input= in.nextLine();
			}
			interpretInput(input.toLowerCase());
		}
	}

	private static void interpretInput(String input) {
		int io = i;
		int jo = j;
		if(input.equals("w") && i>0) i--;
		else if(input.equals("a") && j>0) j--;
		else if(input.equals("s") && i+1<arr2d.length) i++;
		else if(input.equals("d")&& j+1<arr2d[0].length) j++;
		if(io ==i && jo==j){
			System.out.println("You are at the edge of the universe, you can't go to that direction");
		}
	}

	private static boolean isValid(String input) {
		String lc = input.toLowerCase();
		String[] keys = {"w","a","s","d"};
		for(String key: keys){
			if(key.equals(lc))return true;
		}
		return false;
	}

}
