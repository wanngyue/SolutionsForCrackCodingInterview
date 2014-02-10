public class Solution {
	public static void main(String[] args) {
		char[] str = "aaaaabc".toCharArray();
		removeDuplicateChars(str);
		System.out.println(String.copyValueOf(str));
	}
	public static void removeDuplicateChars(char[] str){
		if(str == null)return;
		if(str.length < 2) return;
		int position, length = str.length;
		for(position = 0;position < length -1;position++){
			for(int i = position + 1;i < length;i++){
				if(str[position] == str[i]){
					int j;
					for(j = i; j < length - 1;j++){
						str[j] = str[j + 1];
					}
					str[j] = '\0';
					i--;
					length--;
				}
			}
		}
	}
}
