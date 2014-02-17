import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SolutionSelfLinkedList {
	public static void main(String[] args) {
		LinkedListImpl listA = new LinkedListImpl();
		LinkedListImpl listB = new LinkedListImpl();
		//test case
		listA.addToTail(3);
		listA.addToTail(1);
		listA.addToTail(5);
		
		listB.addToTail(5);
		listB.addToTail(9);
		listB.addToTail(1);
		listB.addToTail(1);
		listB.addToTail(1);
		listB.addToTail(1);

		LinkedListImpl listC = sum(listA, listB);
		System.out.println(listC.toString());
	}
	
	public static LinkedListImpl sum(LinkedListImpl lA,LinkedListImpl lB){
		if(lA.isEmpty() || lB.isEmpty()){
			System.out.println("one of the lists is empty");
			return null;
		}
		LinkedListImpl lC = new LinkedListImpl();
		NodeImpl nodeCurrent = lC.firstNode;
		int digit = 0;
		NodeImpl lACurrent = lA.firstNode;
		NodeImpl lBCurrent = lB.firstNode;
		int v;
		while(lACurrent != null || lBCurrent != null){
			v = 0;
			int a, b;
			if(lACurrent == null){
				a = 0;
			}else{
				a = lACurrent.value;
			}
			if(lBCurrent == null){
				b = 0;
			}else{
				b = lBCurrent.value;
			}
			v = a + b + digit;
			digit = 0;
			if(v >= 10){
				v = v - 10;
				digit = 1;
			}
			lC.addToTail(v);
			if(lACurrent != null){
				lACurrent = lACurrent.next;
			}
			if(lBCurrent != null){
				lBCurrent = lBCurrent.next;
			}
			
		}
		if(digit != 0){
			lC.addToTail(digit);
		}
		return lC;
	}
}
