package JCF;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		Collection<Integer> list2 = new ArrayList<>();
		
		list1.add("Mango");
		list1.add("Banana");
		list1.add("Apple");
		
		System.out.println(list1);
		
		list1.remove(1);
		
		System.out.println(list1);
		
		System.out.println(list1.contains("Mango"));
		
		
		ArrayList list3 = new ArrayList();
		
		list3.add(101);
	}
}
