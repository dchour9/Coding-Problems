package Sorting;

public class rotateArray {
	 public static void reverse(int [] arr, int low, int high){
	        
	        while(low < high){
	            int temp = arr[low];
	            arr[low] = arr[high];
	            arr[high] = temp;
	            low++;
	            high--;
	        }
	  }
	 
	 public static void rotate(int [] arr, int numRotations){
		 int order = arr.length - numRotations;
	     reverse(arr, 0, order-1);
	     reverse(arr, order, arr.length-1);
	     reverse(arr,0,arr.length - 1);
	 }
	    
	 public static void main(String[] args) {
	    int [] arr= {1, 2, 3 ,4 ,5 ,6, 7};
	    rotate(arr, 5);
	    for(int i : arr){
	    	System.out.print(i + " ");
	    }
	     
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	}
}
