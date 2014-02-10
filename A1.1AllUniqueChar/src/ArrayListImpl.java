import java.util.ArrayList;


public class ArrayListImpl {

	public static void main(String[] args) {

		String string = "";
		ArrayList array = new ArrayList();
		for(char c:string.toCharArray()){
			
			if(array.contains(c)){
				System.out.println("This string has not all unique characters");
				return;
			}
			array.add(c);
		}
		System.out.println("This String has all unique characters");
	}

}
