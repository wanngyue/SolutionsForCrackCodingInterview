import java.util.ArrayList;
import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
		
		StackArray stack = new StackArray(10);
		//Test case
		stack.push(6);
		stack.push(5);
		stack.push(9);
		stack.push(1);
		stack.push(7);
		stack.push(6);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(10);
		
		StackArray tmp = sortStack1(stack);
		while(!tmp.isEmpty()){
			System.out.println(tmp.pop());
		}
	}
	//Solution with an arraylist
	public static void sortStack(StackArray stack){
		if(stack.isEmpty()){
			System.out.println("Stack is empty");
			return;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(!stack.isEmpty()){
			list.add(Integer.valueOf(stack.pop()));
		}
		Object[] buffer = list.toArray();
		
		Arrays.sort(buffer);
		for(int i = 0;i < buffer.length;i++){
			stack.push(((Integer)buffer[i]).intValue());
		}
	}
	//solution with another stack
	public static StackArray sortStack1(StackArray stack){
		if(stack.isEmpty()){
			System.out.println("Stack is empty");
			return null;
		}
		StackArray buffer = new StackArray(10);
		
		while(!stack.isEmpty()){
			int tmp = stack.pop();
			while(!buffer.isEmpty() && buffer.peek() > tmp){
				stack.push(buffer.pop());
			}
			buffer.push(tmp);
		}
		return buffer;
	}
	
}
