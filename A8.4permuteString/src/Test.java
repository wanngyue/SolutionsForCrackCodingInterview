import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
		String str = "abcd";
		ArrayList<String> allPermutations = new ArrayList<String>();
		
		allPermutations = getAllPermutations(str);
		
		for(String w : allPermutations){
			System.out.println(w);
		}
		
		if(allPermutations.size() == sum(str.length())){
			System.out.println("OK");
		}else{
			System.out.println("KO");
		}
	}
	//each letter is different in the string
	public static ArrayList<String> getAllPermutations(String word){
		ArrayList<String> allPermutation = null;
		if(word == null || word.length() < 2){
			System.out.println("Error");
			return null;
		}else if(word.length() == 2){
			allPermutation = new ArrayList<String>();
			allPermutation.add(word);
			allPermutation.add("" + word.charAt(1) + word.charAt(0));
			return allPermutation;
		}
		allPermutation = new ArrayList<String>();
		char first = word.charAt(0);
		String rest = word.substring(1);
		ArrayList<String> perms = getAllPermutations(rest);
		
		for(String w : perms){
			for(int i = 0;i <= w.length();i++){
				allPermutation.add(insertAt(w, i, first));
			}
		}
		return allPermutation;
	}
	
	public static String insertAt(String str, int index, char c){
		String begin = str.substring(0, index);
		String end = str.substring(index);
		return begin + c + end;
	}
	
	public static int sum(int value){
		if(value > 1){
			return value * sum(value - 1);
		}else {
			return 1;
		}
	}
	
}
