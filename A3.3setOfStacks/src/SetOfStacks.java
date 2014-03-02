import java.util.Arrays;


public class SetOfStacks{
	public int top;
	public int stackSize = 0;
	public int[][] stacks;
	public int lengthStacks = 0;
	//for popAt
	public int[] tops;
	
	
	public SetOfStacks(int size, int numberOfStacks){
		lengthStacks = (size%numberOfStacks == 0)?size/numberOfStacks:(size/numberOfStacks + 1);
		stacks = new int[numberOfStacks][lengthStacks];
		top = -1;
		stackSize = size;
		
		//for popAt
		tops = new int[numberOfStacks];
		Arrays.fill(tops, -1);
	}
	
	public void push(int element){
		if(stackSize > top + 1){
			//for popAt
			if(lengthStacks > tops[(top + 1)/lengthStacks] + 1){
				tops[(top + 1)/lengthStacks]++;	
			}else{
				tops[(top + 1)/lengthStacks + 1]++;
			}

			top++;
			stacks[top/lengthStacks][top%lengthStacks] = element;
			System.out.println("PUSH :" + stacks[top/lengthStacks][top%lengthStacks]);
		}else{
			System.out.println("Stack is full");
		}
	}
	public int pop(){
		if(top >= 0){
			System.out.println("POP :" + stacks[top/lengthStacks][top%lengthStacks]);
			int tmp = stacks[top/lengthStacks][top%lengthStacks];
			//for popAt
			tops[(top + 1)/lengthStacks]--;
			top--;
			return tmp;
		}
		return Integer.MIN_VALUE;
	}
	public int popAt(int index){
		if(index > stackSize/lengthStacks){
			System.out.println("index is out of bound");
			return Integer.MIN_VALUE;
		}
		if(tops[index] < 0){
			System.out.println("substack" + index + " is empty");
			return Integer.MIN_VALUE;
		}else{
			int tmp = stacks[index][tops[index]];
			tops[index]--;
			System.out.println("POP at"+ index +" :" + tmp);
			return tmp;
			
		}
		
	}
	public int peek(){
		if(top >= 0){
			System.out.println("PEEK :"+stacks[top/lengthStacks][top%lengthStacks]);
			return stacks[top/lengthStacks][top%lengthStacks];
		}
		return Integer.MAX_VALUE;
	}
}
