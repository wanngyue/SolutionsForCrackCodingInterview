
public class NoDataStructureImpl {
	public static void main(String[] args){
		String str = "abcdABCD1234a";
		char[] chars = str.toCharArray();
		for(int i = 0;i < str.length();i++){
			for(int j = i + 1;j < str.length();j++ ){
				if(chars[i] == chars[j]){
					System.out.println("This string has not all unique characters");
					System.exit(0);
				}
			}
		}
		System.out.println("This string has all unique characters");
		System.exit(0);
	}
}
