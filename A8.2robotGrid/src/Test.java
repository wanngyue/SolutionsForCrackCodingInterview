import java.util.ArrayList;
import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
		int size = 1;
		System.out.println("The number of the possible paths in a " + size + "*" + size + 
				" is "+ getNumOfPaths(size, size));
		size = 2;
		System.out.println("The number of the possible paths in a " + size + "*" + size + 
				" is "+ getNumOfPaths(size, size));
		size = 3;
		System.out.println("The number of the possible paths in a " + size + "*" + size + 
				" is "+ getNumOfPaths(size, size));
		size = 4;
		System.out.println("The number of the possible paths in a " + size + "*" + size + 
				" is "+ getNumOfPaths(size, size));
	}
	//recursion solution for fibonacci number
	public static int getNumOfPaths(int sizeX, int sizeY){
		if(sizeX < 1 || sizeY < 1){
			return Integer.MIN_VALUE;
		}
		return sum(sizeX - 1 + sizeY - 1)/(sum(sizeX - 1)*sum(sizeY - 1));
	}
	public static int sum(int value){
		if(value > 1){
			return value * sum(value - 1);
		}else {
			return 1;
		}
	}
}
