package Sorting;

public class quickSort {
	
	public static void swap(int [] arr, int low, int high){
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}
	
	public static int partition(int[] arr, int low, int high){
		int pivot = arr[(low + high)/2];
		while(low <= high){
			while(arr[low] < pivot){
				low++;
			}
			while(arr[high] > pivot){
				high--;
			}	
			if(low <= high){
				swap(arr,low,high);
				low++;
				high--;
			}
		}
		return low;
	}
	
	public static void sort(int [] arr, int low, int high){
		int index = partition(arr, low, high);
		if(low < index - 1)
			sort(arr, low, index - 1);
		if(index < high)
			sort(arr, index, high);
		
	}	
	
	public static void main(String [] args){
		int [] arr = {5 ,2 ,3 ,8, 6, 4, 1, 9, 7};
		sort(arr, 0, arr.length - 1);
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
}
