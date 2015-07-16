/*Given two strings, check if they are permuations of each other*/

/*general idea is to sort strings alphabetically and then see if the resulting strings equal each other*/
public class PermutationCheck {
	public static boolean permCheck(String x, String y){
		char[] arrayX = x.toCharArray();
		char[] arrayY = y.toCharArray();
		java.util.Arrays.sort(arrayX);
		java.util.Arrays.sort(arrayY);
		return java.util.Arrays.equals(arrayX, arrayY);
	}
	
	public static void main(String [] args){
		String [][] pairs = {{"apple", "papel"},{"carrot", "tarroc"},{"hello","llloh"}};
		for(String[] pair: pairs){
			boolean perm = permCheck(pair[0], pair[1]);
			System.out.println(pair[0] + " " + pair[1] + " " + perm);
			
		}
	}

}
