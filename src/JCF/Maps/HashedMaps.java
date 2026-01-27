package JCF.Maps;
import java.util.*;

import JCF.Maps.*;

public class HashedMaps {
	public static void main(String[] args) {
		HashMap<Employee,String> hm = new HashMap<>();
		
		Employee e1 = new Employee(1,"Sagnik",3000);
		Employee e2 = new Employee(2,"Sag",2000);
		Employee e3 = new Employee(3,"nik",4000);
		
		hm.put(e1, "HR");
		hm.put(e2, "Dev");
		
		System.out.println(hm);
		
	}
}
