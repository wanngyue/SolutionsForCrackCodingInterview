
public class StackNode {
	public Node top;
	
	public void push(Node newNode){
		if(top == null){
			top = newNode;
		}else{
			newNode.next = top;
			top = newNode;
		}
	}
	public Node pop(){
		if(top == null){
			return null;
		}
		Node tmpNode = top;
		top = top.next;
		return tmpNode;
	}
}
