
public class mostFrequentInt {
	
	public static int mostFrequent(int [] arr){
		int [] numSet = {0,0,0,0,0,0,0,0,0,0};
		int mostCommon = 0;
		for(int i: arr){
			numSet[i]++;
			if(numSet[i] > numSet[mostCommon]){
				mostCommon = i;
			}
		}
		return mostCommon;
	}
	
	public static void main(String [] args){
		int [] arr = {3 ,5 ,4, 3 ,7 ,8 ,1,0, 0 ,5 ,6 ,5};
		System.out.println(mostFrequent(arr));
	}
}
