package JCF.Sets;
import java.util.*;


public class LinkedHashedSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer>lhs = new LinkedHashSet<Integer>();
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		
		//for-each
		for (Integer in : lhs) {
			System.out.println(in);
		}
		
		System.out.println();
		
		//Iterator
        Iterator i = lhs.iterator();
		
		while(i.hasNext()) {
			Object obj1 = i.next();
			System.out.println(obj1);
		}
		
		System.out.println();
		
		ArrayList<Integer>list  = new ArrayList<>(lhs);
		
		
		//List Iterator wont work
        ListIterator<Integer> i2 = list.listIterator();
		
		while(i2.hasNext()) {
			Object obj1 = i2.next();
			System.out.println(obj1);
		}
	}
}
