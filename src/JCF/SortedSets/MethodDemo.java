package JCF.SortedSets;

import java.util.*;

public class MethodDemo {
	public static void main(String[] args) {
		SortedSet<Integer>set = new TreeSet<>();
		 NavigableSet<Integer> set1 = new TreeSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(99);
		set.add(7);
		set.add(8);
		set.add(9);
		set.add(10);
		set.add(11);
		
		System.out.println("first: "+set.first());
		System.out.println("last: "+set.last());
		System.out.println("headSet: "+set.headSet(5));
		System.out.println("tailset: "+set.tailSet(4));
		System.out.println("subset: "+set.subSet(2, 7));
		System.out.println("comparator: "+set1.comparator());
		System.out.println("------------------------------------------------");

	        // ===== NavigableSet methods =====
		 
		 
		    set1.add(1);
			set1.add(2);
			set1.add(3);
			set1.add(4);
			set1.add(5);
			set1.add(99);
			set1.add(7);
			set1.add(8);
			set1.add(9);
			set1.add(10);
			set1.add(11);
			
	        System.out.println("lower(3): " + set1.lower(3));
	        System.out.println("floor(5): " + set1.floor(5));
	        System.out.println("ceiling(5): " + set1.ceiling(5));
	        System.out.println("higher(5): " + set1.higher(5));

	        System.out.println("pollFirst(): " + set1.pollFirst());
	        System.out.println("pollLast(): " + set1.pollLast());

	        System.out.println("After polling set: " + set1);

	        System.out.println("Descending order:");
	        Iterator<Integer> it = set1.descendingIterator();
	        while (it.hasNext()) {
	            System.out.print(it.next() + " ");
	        }
	    }
	}