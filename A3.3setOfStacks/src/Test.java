
public class Test {

	public static void main(String[] args) {

		SetOfStacks stack = new SetOfStacks(10, 3);
		//Test case
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		stack.push(10);
		stack.peek();
		stack.popAt(1);
		stack.popAt(2);
		stack.popAt(0);
		stack.popAt(2);
		stack.popAt(2);
		
	}
}
