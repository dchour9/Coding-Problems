package Tree;


public class LinkedListNode {

	public LinkedListNode next;
	//public LinkedListNode prev; necessary for doubly linked list
	public int data;
	
	public LinkedListNode(LinkedListNode n){
		data = n.data;
		next = n.next;
	}
	
	public void setNext(LinkedListNode n){
		next = n;
	}
	
	
	public LinkedListNode(int d, LinkedListNode n){
		data = d;
		next = n;
		//prev = p;
	}
}