
public class Stack {
	public LinkedListNode top;
	public int size;
	public Stack(LinkedListNode n){
		top = n;
		size = 0;
	}
	
	public LinkedListNode pop(){
		if(top != null){
			LinkedListNode ret = top;
			top = top.next;
			size--;
			return ret;
			
		}
		return null;
	}
	
	public int peek(){
		if(top != null){
			return top.data;
		}
		return 0;
	}
	
	public void push(int n){
		LinkedListNode m = new LinkedListNode(n, top);
		top = m;
		size++;
	}
	

}
