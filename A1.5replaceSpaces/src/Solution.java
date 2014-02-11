import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {
		System.out.println(replaceSpaces("\0"));
	}
	public static String replaceSpaces(String str){
		char[] chars = str.toCharArray();
		int space_c = 0;
		for(char c:chars){
			if(c == ' '){
				space_c++;
			}
		}
		char[] newChars = new char[chars.length + space_c*2];
		int j = 0;
		for(int i = 0;i < str.length();i++){
			if(chars[i] == ' '){
				newChars[i + j] = '%';
				newChars[i + j + 1] = '2';
				newChars[i + j + 2] = '0';
				j +=2;
			}else{
				newChars[i + j] = chars[i];
			}
		}
		return String.copyValueOf(newChars);
	}
}
