package Sorting;

public class mergeSort {
	public static void sort(int [] a){
		int [] helper = new int[a.length];
		sort(a, helper, 0, a.length - 1);
	}

	public static void sort(int [] a, int [] helper, int low , int high){
		if(low < high){
			int middle = (low + high)/2;
			sort(a, helper, low, middle);
			sort(a, helper, middle + 1, high);
			merge(a, helper, low, middle, high);
		}
	}
	
	public static void merge(int [] a, int [] helper, int low, int middle, int high){
		for(int i = low; i <= high; i++){
			helper[i] = a[i];
		}
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;
		
		while(helperLeft <= middle && helperRight <= high){
			if(helper[helperLeft] <= helper[helperRight]){
				a[current] = helper[helperLeft];
				helperLeft++;
			}else{
				a[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		int remaining = middle - helperLeft;
		for(int i = 0; i <= remaining; i++){
			a[current + i] = helper[helperLeft + i];
		}
	}
	
	public static void main(String [] args){
		int [] arr = {1, 5, 9, 11, 33, 71, 4, 13, 17, 21 ,24 ,25};
		sort(arr);
		for(int i : arr){
			System.out.print(i + " ");
		}
		
	}
}
