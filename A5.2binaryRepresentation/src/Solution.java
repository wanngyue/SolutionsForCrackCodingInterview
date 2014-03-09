import java.util.Arrays;

public class Solution {

	public static void main(String[] args){
		int N = Integer.parseInt("10000000000", 2), M = Integer.parseInt("10101", 2);
		int i = 2, j = 6;
		
		if(Integer.toBinaryString(M).length() != j - i + 1){
			System.out.println("Error inputs : i, j, M");
			return;
		}
		
		System.out.println(Integer.toBinaryString(setBits(N, M, i, j)));
	}
	
	public static int setBits(int n, int m, int i, int j){
		int max = ~0;
		
		int left = max - (1 << (j + 1) - 1);
		int right = max - (1 << i -1);
		
		int mask = left | right;
		
		return (n & mask)|(m << i);
	}

}
