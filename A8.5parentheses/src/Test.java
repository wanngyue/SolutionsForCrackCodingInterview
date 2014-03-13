import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Test {

	public static void main(String[] args) {

		printPar(5);
	}

	public static void printPar(int l, int r, char[] str, int count) {
		if (l < 0 || r < l) return; // invalid state
		if (l == 0 && r == 0) {
			System.out.println(str); // found one, so print it
		}else {
			if (l > 0) { // try a left paren, if there are some available
				str[count] = '(';
				printPar(l - 1, r, str, count + 1);
			}
			if (r > l) { // try a right paren, if there’s a matching left str[count] = ‘)’;
				str[count] = ')';
				printPar(l, r - 1, str, count + 1);
			}
		}
	}
	public static void printPar(int count) { 
		char[] str = new char[count*2]; 
		printPar(count, count, str, 0);
	}

}

