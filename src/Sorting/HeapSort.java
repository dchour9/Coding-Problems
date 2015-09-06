package Sorting;
import java.util.*;
public class HeapSort {
	public static void sort(int [] arr){
		PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
		for(int i: arr){
			pq.add(i);
		}
		for(int i = 0; i < arr.length; i++){
			arr[i] = pq.poll();
		}
	}
	
	public static void main(String [] args){
		int [] arr = {5 ,2 ,3 ,8, 6, 4, 1, 9, 7};
		sort(arr);
		for(int i : arr){
			System.out.println(i + " ");
		}
	}
}
