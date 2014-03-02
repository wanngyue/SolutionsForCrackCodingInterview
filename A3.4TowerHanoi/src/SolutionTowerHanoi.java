import java.util.Arrays;


public class SolutionTowerHanoi{
	public static void main(String[] args) {
		int numberOfDisks = 10;
		Tower t0 = new Tower(numberOfDisks, 0);
		Tower t1 = new Tower(numberOfDisks, 1);
		Tower t2 = new Tower(numberOfDisks, 2);

		//test case
		t0.push(10);
		t0.push(9);
		t0.push(8);
		t0.push(7);
		t0.push(6);
		t0.push(5);
		t0.push(4);
		t0.push(3);
		t0.push(2);
		t0.push(1);
		
		t0.moveDisks(numberOfDisks, t2, t1);
		t2.display();
	}
}
