/* replace spaces in a string with %20*/

public class replaceSpace {
	public static void replace(String s){
		ArrayList<Character> arrList = new ArrayList<Character>();
		for(char c: s.toCharArray()){
			if(c == ' '){
				arrList.add('%');
				arrList.add('2');
				arrList.add('0');
			}
			else{
				arrList.add(c);
			}
		}
		String result ="";
		for(char c:arrList){
			result+=c;
		}
		System.out.println(result);
	}
	
	
	public static void main(String[] args){
		String s = "The quick fox jumped over the lazy dog";
		replace(s);
		s = "ayyy lmao whatup";
		replace(s);
	}
	

}
