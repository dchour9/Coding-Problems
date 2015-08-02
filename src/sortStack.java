import java.util.Stack;
public class sortStack {
	
	public static Stack<Integer> sort(Stack<Integer> s){
		
		//temporary stack to be ordered based off original stack
		Stack<Integer> temp = new Stack<Integer>();
		//push top item of original stack onto temp
		int d = s.pop();
		temp.push(d);
		while(!(s.isEmpty())){
			//while there are items left to sort
			if(s.peek() > temp.peek()){
				//if the top item of original stack is larger, push it onto temp
				temp.push(s.pop());
				
			}
			else{
				int i = s.pop();
				//while the top item of the original stack is less than
				//the top of the temp, push the top of temp onto the orignal
				//with the value of the first top of the original saved to i
				while(!(temp.isEmpty()) && i < temp.peek()){
					s.push(temp.pop());
				}
				//int p = temp.pop();
				//this puts i in the proper place to push onto temp
				temp.push(i);
			}
		}
		
		return temp;
	}
	
	public static void main(String [] args){
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("The original stack from bottom to top is: ");
		stack.push(5);
		System.out.println(stack.peek());
		stack.push(4);
		System.out.println(stack.peek());
		stack.push(3);
		System.out.println(stack.peek());
		stack.push(8);
		System.out.println(stack.peek());
		stack.push(7);
		System.out.println(stack.peek());
		stack.push(1);
		System.out.println(stack.peek());
		stack.push(2);
		System.out.println(stack.peek());
		Stack<Integer> temp = sort(stack);
		System.out.println("The stack from top to bottom is :");
		while(!temp.isEmpty()){
			System.out.println(temp.pop());
		}

	}
	
}

//s 5 4 3 8 7  //i = 1
//temp 1 2



//s 5 4 8 7   1>2? no i = 3 p = 8
//temp 1 2 3 7           

//


//