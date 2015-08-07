package Tree;
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
			root = new TNode(t.data);
			size++;
		}else{
			TNode temp = root;
			while(temp != null){
				if(t.data < temp.data){
					temp = temp.left;
				}else{
					temp = temp.right;
				}
			}
			temp = new TNode(t.data);
			size++;
		}
	}
	//recursively find height from the root
	public int height(TNode t){
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
	
	public static void main(String [] args){
		Tree T = new Tree();
		T.insert(7);
		T.insert(5);
		T.insert(6);
		T.insert(9);
		T.insert(4);
		T.insert(3);
		T.insert(8);
		T.insert(new TNode(10));
		T.insert(11);
		T.insert(13);
		System.out.println(T.size);

	}
}
