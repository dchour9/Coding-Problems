package Sorting;

public class findRotatedElement {
	public static int indexOfElement(int element, int [] arr, int low, int high){
		int mid = (low + high)/2;
		if(element == arr[mid]){
			return mid;
		}
		if(arr[low] < arr[mid]){
			if(element <= arr[mid] && element >= arr[low]){
				return indexOfElement(element, arr, low, mid-1);
			}
			return indexOfElement(element,arr, mid+1, high);
		}
		else if(arr[low] > arr[mid]){
			if(element >= arr[mid] && element <= arr[high]){
				return indexOfElement(element, arr, mid+1, high);
			}
			return indexOfElement(element, arr, low, mid-1);
		}
		return -1;
	}
	
	//still need to deal with repeating elements.
	
	public static void main(String [] args){
		int [] arr = {15,16,19,20,25,1,3,4,5,7,10,14};
		System.out.println(indexOfElement(5, arr, 0, arr.length - 1	));
	}
}
