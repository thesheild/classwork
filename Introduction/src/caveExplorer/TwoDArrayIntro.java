package caveExplorer;

import java.util.Arrays;

public class TwoDArrayIntro {
	public static void main (String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		
		//rows, columns
		String[][] arr2d = new String[4][3];
		//iterate row by row
		for(int row = 0 ; row < arr2d.length; row++){
			// in each row go col by col
			for(int col = 0; col<arr2d[row].length; col++){
				arr2d[row][col]="(" + row + "," + col +")";
			}
		}
		//print each row
		for(String[] row: arr2d){
			System.out.println(Arrays.toString(row));
		}
	}
}
