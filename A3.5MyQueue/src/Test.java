
public class Test {

	public static void main(String[] args) {

		MyQueue queue = new MyQueue(10);
		//Test case
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		queue.enqueue(9);
		queue.enqueue(10);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(11);
		queue.enqueue(12);
		queue.enqueue(13);
		queue.enqueue(14);
	}
}
