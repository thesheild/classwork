package datatypes;

import java.util.Random; 

public class MathRandom {

	public static void main (String[] args){
		int[] results = new int[6];
		int totalRolls = 10000;
		for(int index=0; index<totalRolls; index++){
			int roll = rollunFairDie();
			System.out.println("Roll #" + (index +1) + " Die is " + rollFairDie());
			results[roll-1]++;
		}
		for (int i=0; i<6; i++){
			System.out.println((i+1)+ " was rolled " + (int)(((double)results[i]/totalRolls)*100) + "% times");
		}
	}
	
	public static int rollFairDie(){
		//Random gen = new Random();
		//return gen.nextInt(6)+1;
		double rand = Math.random(); //random between 0 and 1 exclusive
		int roll = (int) (6* rand); // [0,5] this is what above code does
		return roll +1; // 0 becomes 1 and 5 becomes 6
	}
	
	public static int rollunFairDie(){
		double rand = Math.random();
		int roll = (int) (7 * rand);
		int x = roll +1;
		if (x == 7) return 1;
		else return x;
//		if (roll == 1) return 1; 
//		else if (roll == 2) return 2; 
//		else if (roll == 3) return 3; 
//		else if (roll == 4) return 4; 
//		else if (roll == 5) return 5; 
//		else if (roll == 6) return 6; 
//		else if (roll == 7) return 1; 
//		else if (roll == 8) return 2; 
//		else if (roll == 9) return 3; 
//		else if (roll == 0) return 4; 
		
	}
}
