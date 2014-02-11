import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		char[] str = "iceman".toCharArray();
		char[] str1 = "cinema".toCharArray();
		System.out.println(areAnagrams(str, str1));
	}
	public static boolean areAnagrams(char[] str, char[] str1){
		if(str == null || str1 == null)return false;
		if(str.length != str1.length) return false;
		
		Arrays.sort(str);
		Arrays.sort(str1);
		for(int i = 0;i < str.length;i++){
			if(str[i] != str1[i]){
				return false;
			}
		}
		return true;
	}
}
