//Delete middle node of a linked list
public class deleteMiddleNode {
	
	public static boolean deleteMiddle(LinkedListNode n){
		if(n == null||n.next == null)
			return false;
		LinkedListNode next = n.next;
		n.data = next.data;
		n.next = next.next;
		return true;
	}

}
