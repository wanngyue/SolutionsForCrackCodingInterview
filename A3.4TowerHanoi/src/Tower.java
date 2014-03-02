
public class Tower extends StackArray {
	public int name;
	
	public Tower(int size, int name){
		super(size);
		this.name = name;
	}
	
	public void moveDisks(int numberOfDisks, Tower dest, Tower buffer){
		if(numberOfDisks > 0){
			this.moveDisks(numberOfDisks - 1, buffer, dest);
			this.popTo(dest);
			buffer.moveDisks(numberOfDisks - 1, dest, this);
		}
		System.out.println(numberOfDisks + " disks are moved to " + dest.name);
	}
	public void popTo(Tower dest){
		if(dest.name == this.name){
			System.out.println("Wrong name");
			return;
		}
		if(this.top < 0){
			System.out.println("Tower is empty");
			return;
		}
		dest.push(this.pop());
	}
	public void display(){
		for(int i = 0;i < this.stackSize;i++){
			System.out.println(this.pop());
		}
	}
}
