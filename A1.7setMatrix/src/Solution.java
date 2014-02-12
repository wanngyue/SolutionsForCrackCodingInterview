import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		//test case
		int[][] matrix = {
					 {0,2,3,4},
					 {5,6,7,8},
					 {9,10,11,12},
					 {13,14,15,16}
					};
		int m = 4, n = 4;
		setMatrix(matrix,m, n);
		for(int i = 0;i < m;i++){
			for(int j = 0;j < n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void setMatrix(int[][] matrix, int m, int n){
		boolean[] h = new boolean[m];
		boolean[] v = new boolean[n];
		
		for(int i = 0;i < m;i++){
			for(int j = 0;j < n;j++){
				if(matrix[i][j] == 0){
					h[i] = true;
					v[j] = true;
				}
			}
		}
		/*version not optimized
		for(int i = 0;i < m;i++){
			if(h[i] == true){
				for(int j = 0;j < n;j++){
					matrix[i][j] = 0;
				}
			}
		}
		for(int i = 0;i < n;i++){
			if(v[i] == true){
				for(int j = 0;j < m;j++){
					matrix[j][i] = 0;
				}
			}
		}
		*/
		//version optimized!!
		for(int i = 0;i < m;i++){
			for(int j = 0;j < n;j++){
				if(h[i] || v[j]){
					matrix[i][j] = 0;
				}
			}
		}
	}
}
