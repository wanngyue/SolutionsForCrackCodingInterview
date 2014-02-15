import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		//test case
		list.add(Integer.valueOf(0));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(5));
		list.add(Integer.valueOf(1));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(3));
		list.add(Integer.valueOf(3));
		
		removeDuplicates(list);
		System.out.println(list.toString());
	}
	
	public static void removeDuplicates(List<Integer> list){;
		int size_list = list.size();
		if(size_list == 0){
			System.out.println("List is empty");
		}
		for(int size = 0;size < size_list - 1;size++){
			for(int i = size + 1;i < size_list;i++){
				if(list.get(size) == list.get(i)){
					list.remove(i);
					i--;
					size_list--;
				}
			}
		}
	}
}
