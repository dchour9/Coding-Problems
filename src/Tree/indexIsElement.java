package Tree;
import java.util.Arrays;
public class indexIsElement {
	public static int helper(int [] a, int low, int high){
		int mid = (low + high)/2;
		if(low > high)
			return -1;
		else if(mid == a[mid]){
			return mid;
		}
		else if(mid < a[mid]){
			return helper(a, low, mid - 1);
		}
		else if(mid > a[mid]){
			return helper(a, mid + 1, high);
		}
		return -1;
	}
	
	public static void main(String [] args){
		
		int [] a = {1, 2, 3 , 1, 54, 6, 8, 4};
		Arrays.sort(a);
		System.out.println(helper(a,0,a.length-1));
	}
}
