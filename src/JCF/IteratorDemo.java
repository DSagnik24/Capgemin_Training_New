package JCF;

import java.util.*;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> countries = new ArrayList<>();
		
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("UAE");
		
		for (String s : countries) {
			System.out.println(s);		
		}
		
		System.out.println("++++++++++++++++++++++++++++");
		
		Iterator<String> itr = countries.iterator();
		
		while(itr.hasNext()) {
			String count = itr.next();
			System.out.println(count);
		
		}
		
		System.out.println("++++++++++++++++++++++++++++");
		
		ArrayList li = new ArrayList();
		
		li.add("Java");
		li.add(100);
		li.add(100.50);
		li.add(true);
		
		Iterator i = li.iterator();
		
		while(i.hasNext()) {
			Object obj1 = i.next();
			System.out.println(obj1);
		}
		
		
	}
}
