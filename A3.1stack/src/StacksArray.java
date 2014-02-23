import java.util.Arrays;

//implement 3 stacks by only an array
public class StacksArray {
	public int top0, top1, top2;
	public int stackSize0 = 0, stackSize1 = 0, stackSize2 = 0;
	public String[] stack;
	
	public StacksArray(int size){
		this.stackSize0 = size;
		this.stackSize1 = size;
		this.stackSize2 = size;
		stack = new String[size*3];
		top0 = -1;
		top1 = -2;
		top2 = -3;
		Arrays.fill(stack, "-1");
	}
	public void push(String element, int number){
		int stackSize = -1, top = -1;
		
		switch(number){
			case 0:
				stackSize = stackSize0;
				top = top0;
				break;
			case 1:
				stackSize = stackSize1;
				top = top1;
				break;
			case 2:
				stackSize = stackSize2;
				top = top2;
				break;
			default:
				System.out.println("Unknown number");
		}
		
		if(stackSize > top + 1){
			top += 1;
			stack[top*3] = element;
		}else{
			System.out.println("Stack is full");
		}
	}
	public String pop(int number){
		int top = -1;
		switch(number){
		case 0:
			top = top0;
			break;
		case 1:
			top = top1;
			break;
		case 2:
			top = top2;
			break;
		default:
			System.out.println("Unknown number");
	}
		if(top >= 0){
			int tmp = top*3;
			top--;
			return stack[tmp];
		}
		return null;
	}
	public String peek(int number){
int stackSize = -1, top = -1;
		switch(number){
			case 0:
				stackSize = stackSize0;
				top = top0;
				break;
			case 1:
				stackSize = stackSize1;
				top = top1;
				break;
			case 2:
				stackSize = stackSize2;
				top = top2;
				break;
			default:
				System.out.println("Unknown number");
		}
		if(stackSize < 0 || top < 0){
			return null;
		}
		
		return stack[top*3];
	}
}
