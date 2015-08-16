package Sorting;
import java.util.*;
public class AnagramComparator implements Comparator<String> {
	public String sortChars(String s){
		char [] sArray = s.toLowerCase().toCharArray();
		Arrays.sort(sArray);
		return new String(sArray);
	}
	
	public int compare(String s1, String s2){
		return sortChars(s1).compareTo(sortChars(s2));
	}
}
