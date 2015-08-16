package Sorting;
import java.util.*;
public class sortAnagrams {
	
	
	public static void main(String [] args){
		String [] list = {"War", "was", "chum", "Saw", "raw", "much", "can", "pac", "nac"};
		Arrays.sort(list, new AnagramComparator());
		for(String s : list){
			System.out.print(s + " ");
		}
		
		
	}
}
