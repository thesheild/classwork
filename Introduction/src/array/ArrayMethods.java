package array;

public class ArrayMethods { 
	
	public static void main(String[]args){
//		int[] arr = {2,3,4,6,9,11,12,15};
//		swap(arr,0,arr.length-1);
//		shuffle(arr);
//		print(arr);
//		if (checkHalfway(arr,12,0, arr.length-1)){
//			System.out.println("The number you are searching for is less than the value in the middle of the array");
//		}
//		else{
//			System.out.println("The number you are searching for is greater than or equal to the value in the middle of the array");
//		}
		int[] arr = {3,6,9,11,14,16};
		//int[] subArr = getSubArray()
	}
	
	public static int[] getSubArray(int[]arr, int startIndex, int endIndex){
		int[] subArray = new int[endIndex - startIndex + 1];
		for(int i=0; i<subArray.length; i++){
			subArray[i] = arr[startIndex+1];
		}
		return subArray;
	}
	
	public static boolean contains(int[]arr, int[] subArray){// do this at home 
		for(int i=0; i<arr.length; i++){
			if(arr[i] == subArray[0]){
				//check the rest of the elements
				int j =i;
				while (j <arr.length){
					if(subArray[j] == arr && ){
						
					}
				}
			}
		}
	}
	
	private static void print(int[]arr){
		for(int i=0; i<arr.length-1;i++){
			System.out.println(arr[i]+", ");
		}
		System.out.println(arr[arr.length-1]);
	}
	public static int countUnderBound(double[]arr, double d){
		int ctr=0;
		for(int i=0; i<arr.length; i++){
			if (arr[i]<d){
				ctr++;
			}
		}
		return ctr;
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