package Sorting;

public class insertionSort {
	
	public static void sort(int [] arr){
		int previous;
		for(int i = 0; i < arr.length; i++){
			int num = arr[i];
			previous = i - 1;
			while(previous >= 0 && arr[previous] >= num){
				arr[previous+1] = arr[previous];
				previous--;
			}
			arr[previous+1] = num;
			
		}
	}
	
	public static void main(String [] args){
		
		int [] arr = {5,4,6,1,9,7,2,8,3};
		sort(arr);
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
}
