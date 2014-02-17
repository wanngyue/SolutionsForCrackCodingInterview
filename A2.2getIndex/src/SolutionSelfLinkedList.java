import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SolutionSelfLinkedList {
	public static void main(String[] args) {
		LinkedListImpl list = new LinkedListImpl();
		//test case
		list.addToTail(0);
		list.addToTail(1);
		list.addToTail(1);
		list.addToTail(3);
		list.addToTail(5);
		list.addToTail(0);
		list.addToTail(6);
		list.addToTail(6);
		list.addToTail(3);
		list.addToTail(7);
		NodeImpl node = getNthLastNode(list, 3);
		System.out.println(node.toString());
	}
	
	public static NodeImpl getNthLastNode(LinkedListImpl list, int n){
		NodeImpl runner = list.firstNode;
		NodeImpl current = list.firstNode;
		
		if(n < 1 || list.isEmpty()){
			return null;
		}
		
		for(int i = 0; i < n - 1;i++){
			
			if(runner.equals(null)){
				System.out.println("list is not long enough");
				return null;
			}
			runner = runner.next;
		}
		while(runner.next != null){
			runner = runner.next;
			current = current.next;
		}
		return current;
	}
}
