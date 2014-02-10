
public class Solution {

	public static void main(String[] args) {
		String str = "abcdABCD\0";
		char[] chars = new char[str.length()];
		chars[str.length() - 1] = '\0';
		for(int i = 0;i < str.length() - 1;i++){
			chars[i] = str.charAt(str.length() - i - 2);
		}
		String str1 = String.copyValueOf(chars);
		System.out.println(str1);
	}

}
