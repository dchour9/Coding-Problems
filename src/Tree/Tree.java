package Tree;
import java.util.*;
public class Tree {
	public TNode root;
	public int size;
	
	public Tree(){
		root = null;
		size = 0;
	}
	
	public Tree(TNode n, int d){
		root = n;
		size = d;
	}
	
	//create root node or recursively call Tnode's insert
	public void insert(int d){
		if(size == 0){
			root = new TNode(d);
			size++;
		}else{
			root.insert(d);
			size++;
		}
	}
	
	public void insert(TNode t){
		if(size == 0){
			root = new TNode(t);
			size++;
		}else{
			root.insert(t);
			size++;
		}
	}
	
	//recursively find height from the root
	public static int height(TNode t){
		if(t == null){
			return 0;
		}else{
			return Math.max(height(t.left), height(t.right)) + 1;
		}
	}
	
	public boolean isBalanced(){
		if(Math.abs(height(root.left) - height(root.right)) > 1){
			return false;
		}
		return true;
	}
	
	public TNode findAncestor(TNode a, TNode b){
		if(a == null || b == null){
			return null;
		}
		TNode tempA = root;
		while(tempA.data != a.data){
			if(a.data < tempA.data){
				tempA = tempA.left;
			}else{
				tempA = tempA.right;
			}
		}
		TNode tempB = root;
		while(tempB.data != b.data){
			if(b.data < tempB.data){
				tempB = tempB.left;
			}else{
				tempB = tempB.right;
			}
		}
		while(tempA != tempB){
			if(tempA.parent != null){
				tempA = tempA.parent;
			}
			if(tempB.parent != null){
				tempB = tempB.parent;
			}
		}
		
		return tempA;
		
	}
	
	/* Recursive function comparing a pair of nodes from respective trees until result is determined*/
	public static boolean matchTrees(TNode a, TNode b){
		//empty tree is subtree of another empty tree
		if(a == null && b == null){
			return true;
		}
		//if only one is empty then no subtree is possible
		if(a == null || b == null){
			return false;
		}
		//passed in nodes don't match, base case return false
		if(a.data != b.data){
			return false;
		}
		//Repeat the function call passing in the left and right nodes for each tree
		return(matchTrees(a.left, b.left) && matchTrees(a.right, b.right));
	}
	
	/*Pass in tree to see if current tree is a subtree of that tree
	 */
	public boolean isSubtreeOf(Tree t){
		//find root of larger tree
		TNode newRoot = t.root;
		//traverse tree to find roots location
		while(newRoot.data != root.data){
			if(newRoot.data > root.data){
				if(newRoot.left != null){
					newRoot = newRoot.left;
				}else{
					//root doesn't exist in larger tree
					return false;
				}
			}
			else if (newRoot.data < root.data){
				if(newRoot.right != null){
					newRoot = newRoot.right;
				}else{
					//root doesnt exist in larger tree
					return false;
				}
			}
		}
		System.out.println("found root at " + newRoot.data);
		System.out.println("newRoots parent is " + newRoot.parent.data);
		System.out.println("root is " + root.data);
		//recursive function to match rest of the trees
		return(matchTrees(root, newRoot));
	}
	
	public static void findPath(TNode node, int value, int[] path, int level){
		if(node == null){
			return;
		}
		
		//insert current node into path
		path[level] = node.data;
		
		int sum = 0;
		for(int i = level; i >= 0; i--){
			sum += path[i];
			//System.out.println("sum after adding " + path[i] + " is " + sum);
			//System.out.println("Value to find is " + value);
			if(sum == value){
				//System.out.println("sum is " + sum + " is equal to " + value);
				printPath(path, i, level);
			}
		}
		
		findPath(node.left, value, path, level + 1);
		findPath(node.right, value, path, level + 1);
	}
	
	
	public static void printPath(int [] path, int start, int end){
		for(int i = start; i <= end; i++){
			System.out.println(path[i] + " ");
		}
		System.out.println();
	}
	public static void findPathsToSum(TNode node, int value){
		int height = height(node);
		//System.out.println("height was " + height);
		//System.out.println("value to find is " + value);
		int [] path = new int[height];
		findPath(node, value, path, 0);
	}
	
	
	
	public static void main(String [] args){
		Tree T = new Tree();
		T.insert(7);
		T.insert(5);
		T.insert(6);
		T.insert(9);
		T.insert(4);
		//TNode a = new TNode(8);
		T.insert(3);
		//T.insert(a);
		//TNode b = new TNode(10);
		//T.insert(new TNode(b));
		T.insert(11);
		T.insert(13);
		//System.out.println("The common ancestor of 8 and 10 is " + T.findAncestor(a, b).data);
		
		//Test for subtree
		/*Tree test = new Tree();
		test.insert(9);
		test.insert(8);
		test.insert(10);
		test.insert(11);
		test.insert(13);
		System.out.println(test.isSubtreeOf(T));*/
		findPathsToSum(T.root, 40);

	}
}
