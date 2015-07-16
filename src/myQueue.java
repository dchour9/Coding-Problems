import java.util.Stack;
public class myQueue {
	private Stack<Integer> newest, oldest;
	
	public myQueue(){
		newest = new Stack<Integer>();
		oldest = new Stack<Integer>();
		//push the values of one stack using pop to get reverse order
	}
	
	public void add(int d){
		newest.push(d);
	}
	
	private void resort(){
		if (oldest.isEmpty()){
			while(!newest.isEmpty()){
				oldest.push(newest.pop());
			}
		}
	}
	
	public int peek(){
		resort();
		return oldest.peek();
	}
	
	public int remove(){
		resort();
		return oldest.pop();
	}
}
