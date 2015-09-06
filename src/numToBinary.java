import java.util.*;
public class numToBinary {
	public static String toBinary(int n){
		String result = "";
		while(n > 0){
			int rem = n % 2;
			result = rem + result;
			n = n/2;
		}
			
		
		return result;
	}
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Convert to binary : ");
		int num;
		while((num = in.nextInt()) > 0){
			System.out.println(toBinary(num));
			System.out.print("Convert to binary : ");
		}
		
		in.close();
	}
}
