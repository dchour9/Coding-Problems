
public class pairsEqualTo {
	
	public static void pairsEqual(int num, int [] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(i != j && (arr[i] + arr[j]) == num){
					System.out.println(arr[i] + "," + arr[j]);
				}
			}
		}
	}
	
	public static void main(String [] args){
		int [] arr = {1 ,3 ,5 ,7, 2, 4, 8, 9};
		pairsEqual(10, arr);
	}
}
