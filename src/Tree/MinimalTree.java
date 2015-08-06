package Tree;
public class MinimalTree {
	
	private static TNode createMinimalBST(int arr[], int start, int end){
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		TNode n = new TNode(arr[mid]);
		n.setLeftChild(createMinimalBST(arr, start, mid - 1));
		n.setRightChild(createMinimalBST(arr, mid + 1, end));
		return n;
	}
	
	public static Tree createMinimalBST(int array[]) {
		TNode n = createMinimalBST(array, 0, array.length - 1);
		Tree t = new Tree(n, array.length);
		return t;
		
	}
	
	public static void main(String [] args){
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		Tree t = createMinimalBST(numbers);
		System.out.println(t.root.data);
		
		
	}

}
