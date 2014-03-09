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
	public int peek(){
		if(top >= 0){
			return stack[top];
		}else{
			System.out.println("Stack is empty");
			return Integer.MAX_VALUE;
		}
	}
	public boolean isEmpty(){
		if(top < 0){
			return true;
		}else{
			return false;
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(stack);
		result = prime * result + stackSize;
		result = prime * result + top;
		return result;
	}
}
