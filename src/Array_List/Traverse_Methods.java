package Array_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse_Methods {
	public static void main(String[] args) {
		ArrayList<String> lang = new ArrayList<String>();
		lang.add("Java");
		lang.add("Go");
		lang.add("C++");
		lang.add("JS");
		
//		
//		for(String s:lang) {
//			if(s.equals("Go")) {
//				lang.add("Ruby");
//			}
//			System.out.println(s);
//		}
//		
//		Iterator<String>itr3 = lang.iterator();
//		while(itr3.hasNext()) {
//			if(itr3.next().equals("Go")) {
//				lang.add("Ruby");
//			}	
//		}
		
        ListIterator<String> itr4 = lang.listIterator();
		
		while(itr4.hasNext()) {
			if(itr4.next().equals("Go")) {
				itr4.add("Ruby");
			}
		}
		System.out.println(lang);
	}
}
