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
		//System.out.println(list.toString());
		removeDuplicates(list);
		System.out.println(list.toString());
	}
	//use a hashmap
	public static void removeDuplicates(LinkedListImpl list){
		Map<Integer, NodeImpl> table = new HashMap<Integer, NodeImpl>();
		NodeImpl nodeCurrent = list.firstNode;
		NodeImpl nodePrevious = null;
		if(list.isEmpty()){
			return;
		}
		while(nodeCurrent != null){
			if(table.containsKey(Integer.valueOf(nodeCurrent.value))){
				nodePrevious.next = nodeCurrent.next;
				nodeCurrent = nodeCurrent.next;
				continue;
			}else{
				table.put(Integer.valueOf(nodeCurrent.value), nodeCurrent);
			}
			nodePrevious = nodeCurrent;
			nodeCurrent = nodeCurrent.next;
		}
		
	}
}
