import java.util.Arrays;


public class StackArray {
	public int top;
	public int stackSize = 0;
	public int[] stack;
	
	public StackArray(int size){
		this.stackSize = size;
		stack = new int[size];
		top = -1;
	}
	public void push(int element){
		if(stackSize > top + 1){
			top++;
			stack[top] = element;
		}else{
			System.out.println("Stack is full");
		}
	}
	public int pop(){
		if(top >= 0){
			return stack[top--];
		}
		return Integer.MIN_VALUE;
	}
}
