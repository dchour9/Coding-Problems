//Find the beginning of a loop in a linked list

//Use runner method to get one node stuck inside the loop
//revert second node to the head and move it until it comes across a node that the previous node has crossed. This is the loop start
public class findLoop {
	public static LinkedListNode findNode(LinkedListNode head){
		System.out.println("finding node");
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				break;
			}
		}
		if(fast == null || fast.next == null){
			return null;
		}
		
		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
		
	}
	
	public static void main(String [] args){
		System.out.println("Running");
		LinkedListNode[] nodes = new LinkedListNode[5];
		for(int i = 0; i < nodes.length; i++){
			nodes[i] = new LinkedListNode(i, null);
			if(i > 0){
				nodes[i-1].next = nodes[i];
				
			}
		}
		nodes[nodes.length - 1].next = nodes[nodes.length - 3];
		LinkedListNode loop = findNode(nodes[0]);
		if(loop == null)
			System.out.println("no loop");
		else
			System.out.println(loop.data);
		
	}

}
