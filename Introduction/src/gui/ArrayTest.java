package gui;


public class ArrayTest {
	private static boolean[][] grid;

	public static void main(String[] args){
		printGrid();
//		buttonClick(3,3);
	}
	
	public static void switchRow(boolean[][] grid, int r, int c){
		
	}
	
	public static void switchColumn(boolean[] grid, int r, int c){
		
	}
	
	private static void buttonClick(int r, int c) {
		if(r>0 && r<grid.length){
			
		}
	}

//	public static void array(){
//		boolean arr[][] = new boolean[5][5]; 
//		for(int i=0; i<arr.length-1; i++){
//			for(int j=0; j<arr[0].length-1; j++){
//				if([i][j]){
//					System.out.println("o");
//				}
//				else{
//					System.out.println("x");
//				}
//				
//			}
//		}
//	}
	
	public static void printGrid(){
	    for(boolean[] row: grid){
	      for(boolean b: row){
	      	if(b)System.out.print("O");
	        else System.out.print("X");
	      }
	      System.out.print("\n");
	    }
	  }

}
