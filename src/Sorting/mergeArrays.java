package Sorting;
public class mergeArrays {
	
	public static void mergeSortedArrays(int [] a, int [] b, int lastA, int lastB){
		int indexA = lastA - 1;
		int indexB = lastB - 1;
		int merged = lastA + lastB - 1;
		
		while(indexB >= 0){
			if(indexA >= 0 && a[indexA] > b[indexB]){//end of a bigger than end of b, place last element
				a[merged] = a[indexA];
				indexA--;
				//dont change index of other array that we are comparing to so we don't skip the number
			}else{
				a[merged] = b[indexB];
				indexB--;
			}
			//decrement the index to the next spot we want to fill
			merged--;
				
		}
	}
	
	public static void main(String [] args){
		int [] a = {1, 5, 9, 11, 33, 71, 0 , 0 , 0 ,0 ,0, 0};
		int [] b = {4, 13, 17, 21 ,24 ,25};
		mergeSortedArrays(a, b, 6, 6);
		for(int i: a){
			System.out.print(i + " " );
		}
	
	}
}
