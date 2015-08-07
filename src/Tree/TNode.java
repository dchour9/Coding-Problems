package Tree;

public class TNode {
	public int data;
	public TNode right;
	public TNode left;
	public TNode parent;
	
	public TNode(int n){
		data = n;
	}
	
	public int distanceFromNode(TNode t){
		TNode temp = t;
		int distance = 0;
		while(temp.data != data){
			if(data < temp.data){
				temp = temp.left;
			}
			else if(data > temp.data){
				temp = temp.right;
			}
			distance++;
		}
		return distance;
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
	
	public void insert(TNode t){
		if(t.data <= this.data){
			if(this.left == null){
				//create node at empty spot
				this.setLeftChild(t);
			}else{
				//recursively find empty leaf spots
				this.left.insert(t);
			}
		}else{
			if(this.right == null){
				this.setRightChild(t);
			}else{
				this.right.insert(t);
			}
		}
	}
	
	
	public static void main(String [] args){
		TNode t = new TNode(5);
		t.insert(4);
		t.insert(6);
		t.insert(5);
		TNode test = new TNode(8);
		t.insert(test);
		t.insert(3);
		TNode test2 = new TNode(1);
		t.insert(test2);
		System.out.println("distance of test to root is " + test2.distanceFromNode(t));
		System.out.println(t.left.data);
		System.out.println(t.right.data);
		System.out.println(t.left.parent.data);
		System.out.println(t.left.right.data);
	}

}
