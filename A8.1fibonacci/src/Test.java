import java.util.ArrayList;
import java.util.Arrays;


public class Test {

	public static void main(String[] args) {
		int index = 10;
		System.out.println("The " + index + "th fibonacci number is " + getValue(index));
		index = 1;
		System.out.println("The " + index + "th fibonacci number is " + getValue(index));
		index = 2;
		System.out.println("The " + index + "th fibonacci number is " + getValue(index));
		index = 3;
		System.out.println("The " + index + "th fibonacci number is " + getValue(index));
	}
	//recursion solution for fibonacci number
	public static int getValue(int index){
		if(index > 1){
			return getValue(index - 1) + getValue(index -2);
		}else if(index == 0){
			return 0;
		}else if(index == 1){
			return 1;
		}
		return Integer.MAX_VALUE;
	}
}
