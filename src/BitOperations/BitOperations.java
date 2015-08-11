package BitOperations;

public class BitOperations {
	
	public static int mergeBits(int N, int M, int i, int j){
		if(i > j || i >= 32){
			return 0;
		}
		
		int allOnes = ~0; //create string of ones to create left half of bitmask
		int left = allOnes << j + 1; //created by taking 1's and shifting away the part after the left cut
		int right = ((1 << i) - 1); //take 1 and shift away parts after right cut
		int mask = left|right; //combine the left and right to get a string of 0's in number to mask original number
		int n_cleared = N & mask; //clear out the i-j numbers using mask to create new number
		int m_shifted = M << i; //format M number to be in correct position to insert into N
		return n_cleared | m_shifted; //replace bits of N with bits of M through OR
	}
	
	public static void main(String [] args){
		int N = mergeBits(1024,19,2,6);
		 System.out.println(N);
		 
	}
}
