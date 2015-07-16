
public class LinkedListNode {

	public LinkedListNode next;
	//public LinkedListNode prev;
	//String id;
	public int data;
	
	public LinkedListNode(LinkedListNode n){
		data = n.data;
		next = n.next;
	}
	
	public LinkedListNode(int d, LinkedListNode n){
		data = d;
		next = n;
		//id = i;
		//prev = p;
	}
}
