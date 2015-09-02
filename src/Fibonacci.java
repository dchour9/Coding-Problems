
public class Fibonacci {
	
	public static int fibonacciRecurse(int n){
		if(n == 1 || n == 2)
			return 1;
		return fibonacciRecurse(n-2) + fibonacciRecurse(n-1);
	}
	
	public static int fibonacciIterate(int n){
		if(n == 1 || n == 2)
			return 1;
		int first = 1;
		int second = 1;
		int num = 0;
		//starting at 2nd number already
		for(int i = 0; i < n - 2; i++){
			num = first + second;
			first = second;
			second = num;
		}
		return num;
	}
	
	public static void main(String [] args){
		System.out.println(fibonacciIterate(7));
	}
}
