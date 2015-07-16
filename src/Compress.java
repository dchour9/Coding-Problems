import java.util.Arrays;


public class Compress {
	
	public static void compress (String s){
		char[] str = s.toCharArray();
		String result = "";
		int i = 0;
		while(i<str.length){
			char c = str[i];
			int j = 0;
			while(str[i] == c && i<str.length){
				
				i++;
				j++;
				if(i == str.length){
					break;
				}
				
			}
			result+=c;
			result+=j;		
			
			
		}
		if(result.length() >= s.length()){
			System.out.println(s);
		}
		else
			System.out.println(result);
	}
	
	public static void main(String[] args){
		compress("aaabbbbbc");
		compress("xxxvvvvveeesss");
	}

}
