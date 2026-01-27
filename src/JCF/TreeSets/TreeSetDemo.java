package JCF.TreeSets;

import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("K");
		ts.add("Z");
		ts.add("A");
		ts.add("Z");
		
		System.out.println(ts);
		
		TreeSet<Integer> tss = new TreeSet<Integer>();
		tss.add(1);
		tss.add(2);
		tss.add(3);
		tss.add(2);
		
		System.out.println(tss);
	}
}
