package HashSets;

import java.util.HashSet;

public class HashDemo {
	
	public static void main(String[] args) {
		HashSet<Employee> hs = new HashSet<>();
		
		Employee e1 = new Employee(1, "Nik", 50000.0);
		Employee e2 = new Employee(1, "Nik", 50000.0);
		Employee e3 = new Employee(1, "Nik", 50000.0);
		
		System.out.println(hs.hashCode());
		System.out.println(hs.hashCode());
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		System.out.println(hs);
	}

}