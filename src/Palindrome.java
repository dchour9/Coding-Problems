/*Check if a linked list of ints is a palindrome*/

/*Created a string out of the linked list and then compared it to the reverse of itself*/
public class Palindrome {
	public static boolean isPalindrome(LinkedListNode n){
		String res = "";
		LinkedListNode node = n;
		while(node != null){
			res += node.data;
			if(node.next != null)
				node = node.next;
			else
				break;
		}
		String cmp = res;
		System.out.println("Res is " + res);
		cmp = new StringBuilder(cmp).reverse().toString();
		System.out.println("Cmp is " + cmp);
		return cmp.equals(res);
		
	}
	
	public static void main(String [] args){
		LinkedListNode [] b = new LinkedListNode[6];
		b[0] = new LinkedListNode(4, null);
		b[1] = new LinkedListNode(2, null);
		b[2] = new LinkedListNode(3, null);
		b[3] = new LinkedListNode(3, null);
		b[4] = new LinkedListNode(7, null);
		b[5] = new LinkedListNode(4, null);
		for(int i = 1; i <b.length; i++){
			b[i-1].next = b[i];
		}
		boolean result = isPalindrome(b[0]);
		System.out.println(result);
	}
}
