public class removeDuplicate {
	public static void deleteDups(LinkedListNode head){
		LinkedListNode current = head;
		while(current.next != null){
			LinkedListNode temp = current;
			while(current.next.data == temp.data){
				temp.next = current.next.next;
			}
			current = current.next;
		}
		
	}
	
	public static void main(String [] args){
		LinkedListNode first = new LinkedListNode(5, null, "1");
		LinkedListNode second = new LinkedListNode(10, first, "2");
		LinkedListNode third = new LinkedListNode(10, second, "3");
		LinkedListNode fourth = new LinkedListNode(5, third, "4");
		deleteDups(fourth);
		System.out.println(third.next.id);
	}
}