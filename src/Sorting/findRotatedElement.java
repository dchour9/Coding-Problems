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
	
	public static int indexOfSortedElement(String element, String [] arr, int first, int last){
		int mid = (first + last)/2;
		
		if(arr[mid].isEmpty()){
			int left = mid - 1;
			int right = mid + 1;
			while(true){
				if(left < first || right > last)
					return -1;
				else if(right <= last && !arr[right].isEmpty()){
					mid = right;
					break;
				}
				else if(left >= first && !arr[left].isEmpty()){
					mid = left;
					break;
				}
			}
		}
		
		if(arr[mid] == element){
			return mid;
		}
		else if(arr[mid].compareTo(element) < 0){
			return indexOfSortedElement(element, arr, mid + 1, last);
		}else{
			return indexOfSortedElement(element, arr, first, mid - 1);
		}
	}
	//still need to deal with repeating elements.
	
	public static void main(String [] args){
		//int [] arr = {15,16,19,20,25,1,3,4,5,7,10,14};
		//System.out.println(indexOfElement(5, arr, 0, arr.length - 1	));
		
		String [] arr = {"apple", "", "grape", "", "pear", "banana"};
		System.out.println(indexOfSortedElement("pear", arr, 0, arr.length-1));
	}
}
