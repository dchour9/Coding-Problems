package Sorting;
import java.util.*;
import java.util.Arrays;

public class findDuplicates {
	
	static int [] findDups(int [] a, int [] b){
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		for(int i: a){
			System.out.println("searching for " + i);
			if(binarySearch(i,b,0,b.length - 1)){
				duplicates.add(i);
			}
		}
		int [] dups = new int[duplicates.size()];
		int j = 0;
		for(int k: duplicates){
			dups[j++] = k;
		}
		return dups;
	}
	
	static boolean binarySearch(int num, int [] arr, int start, int end){
		int mid = (start + end)/2;
		if(num == 0)
			System.out.println("mid for  num " + num + " is " + arr[mid]);
		//System.out.println("looking for " + num);
		//System.out.println("arrmid is " + arr[mid]);
		if(start > end)
			return false;
		if(num == arr[mid]){
			System.out.println("found " + num);
			return true;
		}
		else if(num < arr[mid]){
			return binarySearch(num, arr, start, mid - 1);
		}
		else if(num > arr[mid]){
			return binarySearch(num, arr, mid+1, end);
		}
		
		return false;
	}
	
	public static void main(String [] args){
		int [] a = {0 , 1, 5, 6, 8, 9};
		int [] b = {0, 2, 3, 5, 9, 10};
		int [] dups = findDups(a, b);
		System.out.println(Arrays.toString(dups));
 	}
}
