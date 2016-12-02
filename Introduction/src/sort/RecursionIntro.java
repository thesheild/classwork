package sort;

public class RecursionIntro {

	public static void main (String [] args){
		//with a for loop
//		System.out.println("Using a for loop...");
//		for(int i=0; i<5;i++){
//			System.out.println("Hello Everyone");
//		}
//		System.out.println("Using recursion..");
//		int num =5;
//		forLoop(num, new Action() {
//			
//			@Override
//			public void act() {
//				System.out.println("Hello Everyone");
//			}
//		});
//	}
//
//	private static void forLoop(int num, Action action) {
//		if(num<2){
//			action.act();
//		}else{
//			action.act();
//			forLoop(num-1,action);
//		}
		hanoi(5,"A","B","C");
	}
	public static void hanoi(int numdisc, String from, String mid, String to){
		if(numdisc<2){
			print("Move from " + from +" to " + to);
		}else{
//			System.out.println("In order to move " + numdisc +); 
//			finish this maaan
			//move all but last one to peg b
			hanoi(numdisc-1,from,to,mid);
			// move the last one to peg c
			hanoi(1,from,mid,to);
			//move all but last one to c
			hanoi(numdisc-1,mid,from,to);
			
		}
	}
	private static int moveCount;
	private static void print(String string){
		System.out.println("Move #" + moveCount + " " + string);
		moveCount++;
	}
}
