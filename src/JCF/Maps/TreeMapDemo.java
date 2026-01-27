package JCF.Maps;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>(new IntegerComparator());
		tm.put(3, "India");
		tm.put(2, "USA");
		tm.put(5, "CHina");
		tm.put(1, "India");
		tm.put(4, "Brazil");
		
		System.out.println(tm);
		
		TreeMap<Person,String> tm2 = new TreeMap<Person,String>();
		Person p1 = new Person(1,"Sagnik",30);
		Person p2 = new Person(2,"Sag",30);
		Person p3 = new Person(3,"nik",35);
		Person p4 = new Person(1,"Sagnik",30);
		
		tm2.put(p1,"Maharastra");
		tm2.put(p2,"Delhi");
		tm2.put(p3,"Bengal");
		tm2.put(p4,"MP");
		
		System.out.println(tm2);
	}

}
