
public class Clock {
	public int hr, min, sec;
	
	public Clock(){
		hr = 12;
		min = 0;
		sec = 0;
	}
	
	public void forward(){
		sec += 1;
		if(sec == 60){
			sec = 0;
			min += 1;
		}
		if(min == 60){
			min = 0;
			hr += 1;
		}
		if(hr == 13){
			hr = 1;
		}
	}
	
	public void backward(){
		sec -= 1;
		if(sec == -1){
			sec = 59;
			min -= 1;
		}
		if(min == -1){
			min = 59;
			hr -= 1;
		}
		if(hr == 0){
			hr = 12;
		}
	}
	
	public boolean sameTime(Clock b){
		if(hr == b.hr && min == b.min && sec == b.sec)
			return true;
		return false;
	}
	
	public static void main(String [] args){
		Clock a = new Clock();
		Clock b = new Clock();
		int repeats = 60 * 60 * 24;
		System.out.println(repeats + " secs in a day");
		int match = 0;
		for(int i = 0; i < repeats; i++){
			if(a.sameTime(b))
				match++;
			a.forward();
			b.backward();
		}
		System.out.println("Clocks matched " + match + " times in one day");
	}
}
