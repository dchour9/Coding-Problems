
public class reverseCharArray {
	public static String reverse(String str){
		char [] s = str.toCharArray();
		for(int i = 0; i < s.length/2; i ++){
			char c = s[i];
			s[i] = s[s.length - i - 1];
			s[s.length-i-1] = c;
		}
		String reverse = new String(s);
		return reverse;
	}
	
	public static void main(String [] args){
		System.out.println(reverse("hello"));
	}

}
