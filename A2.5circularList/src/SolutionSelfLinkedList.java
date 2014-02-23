import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SolutionSelfLinkedList {
	public static void main(String[] args) {
		//test case
		NodeImpl node0 = new NodeImpl(1);
		NodeImpl node1 = new NodeImpl(2);
		NodeImpl node2 = new NodeImpl(3);
		NodeImpl node3 = new NodeImpl(4);
		NodeImpl node4 = new NodeImpl(5);
		NodeImpl node5 = new NodeImpl(6);
		NodeImpl node6 = new NodeImpl(7);
		
		NodeImpl head = node0;
		node0.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node3;
		
		System.out.println(getFirstNodeCircular(head).toString());
	}
	
	public static NodeImpl getFirstNodeCircular(NodeImpl head){
		NodeImpl n1 = head;
		NodeImpl n2 = head;
		
		if(head == null){
			return null;
		}
		
		while(n2.next != null){
			n1 = n1.next;
			n2 = n2.next.next;
			if(n1 == n2){
				break;
			}
		}
		
		n1 = head;
		while((NodeImpl) n1 != (NodeImpl)n2){
			n1 = n1.next;
			n2 = n2.next;
		}
		return n1;
	}
}
