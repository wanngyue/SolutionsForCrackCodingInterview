import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
		ArrayList<String> set = new ArrayList<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("eee");
		
		ArrayList<ArrayList<String>> subsets = getAllSubsets(set, 0);
		for(ArrayList<String> subset : subsets){
			System.out.println(subset);
		}
		
	}
	public static ArrayList<ArrayList<String>> getAllSubsets(ArrayList<String> set, int index){
		ArrayList<ArrayList<String>> allSubsets = null;
		
		if(index == set.size()){
			allSubsets = new ArrayList<ArrayList<String>>();
			allSubsets.add(new ArrayList<String>());// empty set is subset of the set!
		}else{
			allSubsets = getAllSubsets(set, index + 1);
			ArrayList<ArrayList<String>> moreSubsets = new ArrayList<ArrayList<String>>();
			for(ArrayList<String> subset : allSubsets){
				ArrayList<String> newSubset = new ArrayList<String>();
				newSubset.add(set.get(index));
				newSubset.addAll(subset);
				moreSubsets.add(newSubset);
			}
			allSubsets.addAll(moreSubsets);
		}
		return allSubsets;
	}
	
}
