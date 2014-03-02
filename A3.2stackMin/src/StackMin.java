import java.util.Arrays;


public class StackMin extends StackArray{
	public int top;
	public int stackSize = 0;
	public int[] stack;
	
	public int min = Integer.MAX_VALUE;
	public NodeImpl node = new NodeImpl(min);
	
	public StackMin(int size){
		super(size);
	}
	
	public int min(){
		return min;
	}
	@Override
	public void push(int element){
		if(stackSize > top + 1){
			top++;
			stack[top] = element;
			if(element <= min){
				min = element;
				NodeImpl tmpNode = new NodeImpl(min);
				tmpNode.next = node;
				node = tmpNode;
			}
		}else{
			System.out.println("Stack is full");
		}
	}
	@Override
	public int pop(){
		if(top >= 0){
			if(stack[top] == min){
				node = node.next;
				min = node.value;
			}
			return stack[top--];
		}
		return Integer.MIN_VALUE;
	}
	public int peek(){
		if(top >= 0){
			return stack[top];
		}
		return Integer.MAX_VALUE;
	}
}
