import java.util.Arrays;


public class StackArray {
	public int top;
	public int stackSize = 0;
	public String[] stack;
	
	public StackArray(int size){
		this.stackSize = size;
		stack = new String[size];
		top = -1;
		Arrays.fill(stack, "-1");
	}
	public void push(String element){
		if(stackSize > top + 1){
			top++;
			stack[top] = element;
		}else{
			System.out.println("Stack is full");
		}
	}
	public String pop(){
		if(top >= 0){
			return stack[top--];
		}
		return null;
	}
}
