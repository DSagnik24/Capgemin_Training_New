package HashSets;

import java.util.*;

public class PrintDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer>set = new ArrayList<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(50);
		set.add(20);

		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> dupli = new HashSet<>();

		for (Integer i : set) {
			if(!set1.add(i)) {
				dupli.add(i);
			}
		}
		System.out.println(dupli);
		
	}
}
