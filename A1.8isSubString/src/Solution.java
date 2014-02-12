import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "aabcabc";
		
		if(isRotated(str1, str2)){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
	public static boolean isRotated(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(isSubString(String.valueOf(c1), String.valueOf(c2))){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isSubString(String s1, String s2){
		if(s2.length() > s1.length()){
			return false;
		}
		if(s1.contains(s2)){
			return true;
		}else{
			return false;
		}
	}
}
