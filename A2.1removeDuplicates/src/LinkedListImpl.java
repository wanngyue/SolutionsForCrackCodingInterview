
public class LinkedListImpl {
	public NodeImpl firstNode;

	public LinkedListImpl(){
		this.firstNode = null;
	}
	public boolean isEmpty(){
		if(firstNode == null){
			return true;
		}else{
			return false;
		}
	}
	public void addToTail(int value){
		NodeImpl newNode = new NodeImpl(value);
		if(firstNode == null){
			firstNode = newNode;
		}else{
			NodeImpl nodeCurrent = firstNode;
			while(nodeCurrent.next != null){
				nodeCurrent = nodeCurrent.next;
			}
			nodeCurrent.next = newNode;
		}
	}
	public void removeIndexOf(int index){
		if(firstNode == null){
			System.out.println("list is empty");
		}
		NodeImpl nodeCurrent = firstNode;
		NodeImpl nodePrevious = null;
		if(index == 0){
			firstNode = firstNode.next;
			return;
		}
		int counter = 0;
		while(nodeCurrent != null){
			
			if(counter == index){
				nodePrevious.next = nodeCurrent.next;
				nodeCurrent = nodeCurrent.next;
				break;
			}
			nodePrevious = nodeCurrent;
			nodeCurrent = nodeCurrent.next;
			counter++;
		}
		System.out.println("node not exist");

	}
	
	public String toString() {
		NodeImpl node = firstNode;
		int counter = 0;
		String str = "";
		while(node != null){
			str = str+ "Node:" + counter + node.toString();
			counter++;
			node = node.next;
		}
		return str;
	}

	/*public static void main(String[] args){
		LinkedListImpl list = new LinkedListImpl();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list.toString());
		
	}*/
}
