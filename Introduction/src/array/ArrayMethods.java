package array;

public class ArrayMethods { 
	
	public static void main(String[]args){
		int[] arr = {2,3,4,6,9,11,12,15};
		//swap(arr,0,arr.length-1);
		shuffle(arr);
		print(arr);
		if (checkHalfway(arr,12,0, arr.length-1)){
			System.out.println("The number you are searching for is less than the value in the middle of the array");
		}
		else{
			System.out.println("The number you are searching for is greater than or equal to the value in the middle of the array");
		}
	}
	private static void print(int[]arr){
		for(int i=0; i<arr.length-1;i++){
			System.out.println(arr[i]+", ");
		}
		System.out.println(arr[arr.length-1]);
	}
	
//	public static void cycleThrough(){
//		
//	}
	
	private static void shuffle(int[] arr) {
		for(int i=0;i<arr.length;i++){
			int random = (int) (Math.random()*arr.length);
			swap(arr,i,random);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int placeHolder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeHolder;
	}

	private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end) {
		
		return searchValue < arr[(begin+end+1)/2];
	}
}