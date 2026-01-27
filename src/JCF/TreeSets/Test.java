package JCF.TreeSets;

import java.util.*;

import JCF.TreeSets.*;

public class Test {
    public static void main(String[] args) {

        TreeSet<Employee> ts = new TreeSet<>();
         
        Employee e1 = new Employee(1, "Nik", 50000.0);
        Employee e2 = new Employee(2, "Amit", 50000.0);
        Employee e3 = new Employee(3, "Raj", 60000.0);

        ts.add(e1);
        ts.add(e2);
        ts.add(e3);

        for (Employee e : ts) {
            System.out.println(e);
        }
    }
}

