package caveExplorer;

public class Practice {
	public static void main(String[] args){
		boolean[][] mines = new boolean[6][6];
		createMines(mines,10);
		String[][] field = new String[mines.length][mines[0].length];
		matchValues(field,mines);
		printPic(field);
		String [][] map = new String[16][30];
		createMap(map);
		printPic(map);
	}

	private static void createMap(String[][] m) {
		for(int row = 0 ; row < m.length; row++){
			for(int col = 0; col<m[row].length; col++){
				m[row][col]=" ";
			}
		}
		for(int i=1; i<m[0].length-1; i++){
			m[0][i]="_";
		}//top row
		for(int i=1; i<m.length; i++){
			m[i][0]="|";
		}//left side
		for(int i=1; i<m[0].length; i++){
			m[m.length-1][i]="_";
		}//bottom row
		for(int i=1; i<m.length; i++){
			m[i][m[0].length-1]="|";
		}//right side

		for(int i=0; i<m[0].length; i++){
			m[m.length/4][i]="_";
		}
		for(int i=0; i<m[0].length; i++){
			m[m.length/2][i]="_";
		}
		for(int i=0; i<m[0].length; i++){
			m[(m.length*3)/4][i]="_";
		}
		
		for(int i=1; i<m.length; i++){
		m[i][m[0].length/5]="|";
		}
		for(int i=1; i<m.length; i++){
			m[i][m[0].length*2/5]="|";
		}
		for(int i=1; i<m.length; i++){
			m[i][m[0].length*3/5]="|";
		}
		for(int i=1; i<m.length; i++){
			m[i][m[0].length*4/5]="|";
		}

		
//		m[1][29]="|";
		//work on this
	}

	private static void matchValues(String[][] field, boolean[][] mines) {
		for(int row = 0; row<field.length;row++){
			for(int col = 0; col<field[0].length;col++){
				if(mines[row][col]){
					field[row][col]="X";
				}
				else{
					field[row][col] = countAdjacent(mines,row,col);
				}
			}
		}
		
	}

	private static String countAdjacent(boolean[][] mines, int r, int c) {
		//r and c represent coordinates of element we're making a string for
		int count=0;
		//loop thru row above to row below
//		for(int row = r-1; row<=r+1; row++){
//			//loop thru col left to right
//			for(int col = c-1; col<=c+1; col++){
//				//exclude this element when counting
//				if(row!=r && col!=c){
//					if(row>=0 && row<mines.length && col>=0 && col<mines[row].length){
//						
//					}
//				}
//			}
//		}
		//this method only checks elements in the 2d array so it is not nessecary to verify they are valid
//		for(int row=0; row<mines.length; row++){
//			for(int col=0; col<mines[row].length; col++){
//				if(Math.abs(row-r) + Math.abs(col-c) == 1 && mines[row][col]){
//					count++;
//				}
//			}
//		}
		//this method is very helpful if you want to be specific
		//above
		count+=validAndTrue(mines,r-1,c);
		//below
		count+=validAndTrue(mines,r+1,c);
		//right
		count+=validAndTrue(mines,r,c+1);
		//left
		count+=validAndTrue(mines,r,c-1);
		return count+"";
	}

	private static int validAndTrue(boolean[][] mines, int i, int j) {
		if(i>=0 && i<mines.length && j>=0 && j<mines[0].length && mines[i][j]){
			//checks if true AFTER CHECKING VALIDITY
			return 1;
		}
		else{
			return 0;
		}
	}

	private static void createMines(boolean[][] mines, int numberOfMines) {
		while(numberOfMines>0){
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			if(!mines[row][col]){
				mines[row][col]=true;
				numberOfMines--;
			}
		}
	}

	public static void printPic(String[][] pic){
		for(int i=0; i<pic.length; i++){
			for(int j=0; j<pic[i].length; j++){
				System.out.print(pic[i][j]);
			}
			System.out.println();
		}
	}
}
