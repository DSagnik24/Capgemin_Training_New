package Array_List;

import java.util.*;

public class TraverseDemo {
	public static void main(String[] args) {
		ArrayList<String> lang = new ArrayList<String>();
		lang.add("Java");
		lang.add("Go");
		lang.add("C++");
		lang.add("JS");
		
		//Can Traverse forward
		for(String s:lang) {
			System.out.println(s);
		}
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		//Can Traverse Both Directions
		ListIterator <String> itr2 = lang.listIterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		System.out.println("+++++++++++++++++++++++++++++");
		
        ListIterator<String> itr4 = lang.listIterator(lang.size());
		
		while(itr4.hasPrevious()) {
			System.out.println(itr4.previous());
		}
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		//Can Traverse forward 
		Iterator<String> itr = lang.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		
		//Traverse with remove possible
		Iterator<String>itr3 = lang.iterator();
		while(itr3.hasNext()) {
			if(itr3.next().equals("Go")) {
				itr3.remove();
			}	
		}
		
		System.out.println(lang);
		
	}

}
