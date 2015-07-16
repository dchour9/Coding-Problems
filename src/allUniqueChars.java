
public class allUniqueChars {
	public static boolean unique(String s){
		boolean [] charset = new boolean[128];
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
