import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class addNodes {
	public static List<LinkedListNode> add(LinkedListNode[] a, LinkedListNode[] b){
		//LinkedListNode[] result = new LinkedListNode[a.length + b.length];
		String var1 = "";
		String var2 = "";
		for(LinkedListNode a2: a){
			var1 += a2.data;
		}
		var1 = new StringBuffer(var1).reverse().toString();
		for(LinkedListNode b2:b){
			var2 += b2.data;
		}
		var2 = new StringBuffer(var2).reverse().toString();
		int result = Integer.parseInt(var1) + Integer.parseInt(var2);
		System.out.println("result is " + result);
		List<LinkedListNode> nodes = new ArrayList<LinkedListNode>();
		while(result > 0){
			int number =  result % 10;
			LinkedListNode node = new LinkedListNode(number, null);
			System.out.println("Node value is " + node.data);
			nodes.add(node);
			result = result/10;
		}
		Collections.reverse(nodes);
		for(int i = 1; i < nodes.size(); i++){
			nodes.get(i-1).next = nodes.get(i);
		}
		/*LinkedListNode[] sum = new LinkedListNode[nodes.size()];
		for (int i = 0; i < sum.length; i++){
			sum[i] = nodes.get(i);
			if(i > 0){
				sum[i-1].next = sum[i];
			}
		}*/
		return nodes;
	}
	
	public static void main(String []args){
		LinkedListNode[] a = new LinkedListNode[3];
		a[0] = new LinkedListNode(2, null);
		a[1] = new LinkedListNode(3, null);
		a[2] = new LinkedListNode(1, null);
		for(int i = 1; i < a.length; i++){
			a[i-1].next = a[i];
		}
		LinkedListNode [] b = new LinkedListNode[3];
		b[0] = new LinkedListNode(4, null);
		b[1] = new LinkedListNode(7, null);
		b[2] = new LinkedListNode(3, null);
		for(int i = 1; i <b.length; i++){
			b[i-1].next = b[i];
		}
		List<LinkedListNode> result = new ArrayList<LinkedListNode>();
		result = add(a, b);
		System.out.println(result.get(0).data + " -> " + result.get(0).next.data + " -> " + result.get(0).next.next.data);
	}

}
