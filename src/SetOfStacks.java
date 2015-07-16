import java.util.ArrayList;
/*  Imagine a (literal) stack of plates. If the stack gets too high, it migh t topple. Therefore,
in real life, we would likely start a new stack when the previous stack exceeds some
threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks
should be composed of several stacks and should create a new stack once
the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.
pop () should behave identically to a single stack (that is, pop () should return the
same values as it would if there were just a single stack)*/

public class SetOfStacks {
	ArrayList<Stack> stackList;
	int stackCount;
	int capacity;
	boolean capReached;
	LinkedListNode top;
	
	public SetOfStacks(int n){
		capacity = n;
		stackList = new ArrayList<Stack>();
		top = null;
		stackCount = 0;
		capReached = false;
	}
	
	public void push(int d){
		if(stackCount == 0 || capReached){
			Stack s = new Stack(null);
			stackList.add(s);
			stackCount++;
			s.push(d);
			capReached = false;
			if(s.size == capacity)
				capReached = true;
		}
		else{
			Stack s = stackList.get(stackList.size() - 1);
			s.push(d);
			if(s.size == capacity)
				capReached = true;
		}
	}
	
	public int pop(){
		if(stackCount == 0){
			System.out.println("No stacks to pop");
			return 0;
		}
		else{
			Stack s = stackList.get(stackList.size() - 1);
			int val = s.pop().data;
			if(s.size == 0){
				stackList.remove(s);
				stackCount--;
			}
			return val;
		}
	}
	
	public static void main(String[] args){
		SetOfStacks s = new SetOfStacks(3);
		for(int i = 1; i <= 9; i++){
			s.push(i);
		}
		System.out.println("The number of stacks is " + s.stackCount);
		for(Stack l:s.stackList){
			LinkedListNode temp = l.top;
			while(temp != null){
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println("");
		}
	}
}
