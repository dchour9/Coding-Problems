package Tree;

public class TNode {
	public int data;
	public TNode right;
	public TNode left;
	public TNode parent;
	
	public TNode(int n){
		data = n;
	}
	
	
	public void setLeftChild(TNode t){
		this.left = t;
		if(t != null){
			t.parent = this;
		}
		
	}
	
	public void setRightChild(TNode t){
		this.right = t;
		if(t != null){
			t.parent = this;
		}
		
	}

	//going to be called from the root node of the tree.
	//trees insert will call tnode's insert
	public void insert(int d){
		if(d <= this.data){
			if(this.left == null){
				//create node at empty spot
				this.setLeftChild(new TNode(d));
			}else{
				//recursively find empty leaf spots
				this.left.insert(d);
			}
		}else{
			if(this.right == null){
				this.setRightChild(new TNode(d));
			}else{
				this.right.insert(d);
			}
		}
	}
	
	public static void main(String [] args){
		TNode t = new TNode(5);
		t.insert(4);
		t.insert(6);
		t.insert(5);
		System.out.println(t.left.data);
		System.out.println(t.right.data);
		System.out.println(t.left.parent.data);
		System.out.println(t.left.right.data);
	}

}
