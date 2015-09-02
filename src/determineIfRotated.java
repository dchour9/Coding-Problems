import java.util.*;
public class determineIfRotated {
	
	public static boolean areRotated(int [] a, int [] b){
		if(a.length != b.length)
			return false;
		if(Arrays.equals(a, b))
			return true;
		else{
			int numRotations = 0;
			for(int i = 0; i < a.length; i++){
				System.out.println("comparing " + b[0] + " and " + a[i]);
				if(b[0] == a[i]){
					break;
				}
				numRotations++;
			}
		//	System.out.println(numRotations);
			rotate(b, numRotations);
			//System.out.println(Arrays.toString(b));
			return Arrays.equals(a, b);
		}
	}
	
	public static void rotate(int [] a, int numRotations){
		for(int i = 0; i < numRotations; i++){
			for (int j = a.length - 1; j > 0; j--){
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
			}
		}
	}
	
	public static void main(String [] args){
		int [] a = {1,2,3,4,5,6};
		int [] b = {4,5,6,1,2,3};
		System.out.println(areRotated(a,b));
	}
}
