package Tree;
import java.util.*;
public class GroupByDepth {
	//Array containing the leftmost node in each row
	public static LinkedListNode[] groups;
	/*takes in the row as i and the node to insert
	 * either creates the first node in that group or links to the last node
	 * in the group
	 */
	public static void createNextNode(int i, TNode t){
		if(groups[i] == null){
			//create first node in the group
			groups[i] = new LinkedListNode(t.data, null);
		}else{
			//identify head of the group
			LinkedListNode trace = groups[i];
			//iterate until you hit most recent node
			while(trace.next != null){
				trace = trace.next;
			}
			//insert new node
			trace.setNext(new LinkedListNode(t.data, null));
		}
	}
	public static LinkedListNode[] group(Tree t){
		//initialize groups to have a size that is the height of the tree(rows it contains)
		groups = new LinkedListNode[t.height(t.root)];
		//first "row" will always consist of just the root
		groups[0] = new LinkedListNode(t.root.data, null);
		//priority queue to push the Tree nodes to check in order
		Queue<TNode> pq = new LinkedList<TNode>();
		pq.offer(t.root);
		int row = 1;
		while(!pq.isEmpty()){
			TNode temp = pq.poll();
			//check left child
			if(temp.left != null){
				pq.offer(temp.left);
				//insert left child into groups and queue node to be searched for
				createNextNode(row, temp.left);
				//if a right child also exists, do the same
				if(temp.right != null){
					pq.offer(temp.right);
					createNextNode(row, temp.right);
					
				}
			}else{
			//case for if there was only a right child
				if(temp.right != null){
					pq.offer(temp.right);
					createNextNode(row, temp.right);
				}
				//don't increment row number because you have either just cleared the row or there was nothing
				continue;
			}
			TNode next = pq.peek();
			//don't increment the row if you have a node of the same level still on the priority queue
			//move on to the next node on the same level
			if(t.height(next) == t.height(temp)){
				continue;
			}
			row++;
		}
		
		return groups;
		
	}
	
	public static void main(String [] args){
		int [] numbers = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10, 11 , 12 ,13, 14, 15};
		Tree t = MinimalTree.createMinimalBST(numbers);
		LinkedListNode[] arr = new LinkedListNode[t.height(t.root)];
		arr = group(t);
		for(LinkedListNode l: arr){
			LinkedListNode temp = l;
			while(temp != null){
				System.out.print(temp.data + "-> ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

}
