package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class isBinarySearchTree {
	
	public static boolean isBST(Tree t){
		Queue<TNode> pq = new LinkedList<TNode>();
		pq.offer(t.root);
		while(!pq.isEmpty()){
			TNode temp = pq.poll();
			TNode left = temp.left;
			TNode right = temp.right;
			if(left != null){
				if(left.data > temp.data){
					System.out.println(left.data + " is greater than " + temp.data + " and to its left");
					return false;
				}
				pq.offer(left);
			}
			if(right != null){
				if(right.data <= temp.data){
					System.out.println(right.data + " is less than or equal to " + temp.data + " and to its right");
					return false;
				}
				pq.offer(right);
			}
		}
		
		return true;
	}
	
	public static void main(String [] args){
		int [] nums = {1,2,3,4,5,6,7,8,9};
		Tree t = MinimalTree.createMinimalBST(nums);
		//System.out.println(isBST(t));
		TNode root = new TNode(4);
		root.left = new TNode(1);
		root.left.right = new TNode(0);
		root.right = new TNode(5);
		Tree fake = new Tree(root, 4);
		System.out.println(isBST(fake));
	}

}
