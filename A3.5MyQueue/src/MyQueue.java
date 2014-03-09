
public class MyQueue implements Queue {
	int size;
	StackArray stack, cache;

	public MyQueue(int size){
		this.size = size;
		stack = new StackArray(size);
		cache = new StackArray(size);
	}

	@Override
	public void enqueue(int item) {
		if(cache.top + 1 + stack.top + 1 < size){
			stack.push(item);
		}else{
			System.out.println("queue is full");
			return;
		}
	}

	@Override
	public int dequeue() {
		if(stack.top < 0 && cache.top < 0){
			System.out.println("queue is empty");
			return Integer.MAX_VALUE;
		}else if(cache.top >= 0){
			int tmp = cache.pop();
			System.out.println("Dequeue :" + tmp);
			return tmp;
		}else if(stack.top >= 0){
			while(stack.top >= 0){
				cache.push(stack.pop());
			}
			int tmp = cache.pop();
			System.out.println("Dequeue :" + tmp);
			return tmp;
		}
		return Integer.MAX_VALUE;
	}

}
