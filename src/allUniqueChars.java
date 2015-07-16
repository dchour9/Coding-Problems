/*Determine if there are no repeating characters in a string */
public class allUniqueChars {
	public static boolean unique(String s){
		boolean [] charset = new boolean[128];
		//flag each spot in charset as true once it appears in the string
		char [] str = s.toCharArray();
		for(int i = 0; i < str.length; i++){
			int c = str[i];
			if(charset[c] != true){
				charset[c] = true;
			}
			else
				return false;
		}
		return true;
	}
	
	public static void main(String[] args){
		boolean res = unique("abcdefg");
		System.out.println(res);
		res = unique("aabbccddeeaa");
		System.out.println(res);
	}

}
