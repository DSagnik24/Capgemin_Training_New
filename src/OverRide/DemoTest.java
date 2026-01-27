package OverRide;

import java.util.*;

public class DemoTest {
	public static void main(String[] args) {
		HashSet<Person> hs = new HashSet<Person>();

		Person p1 = new Person(1,"abc@gmail.com",30);
		Person p2 = new Person(1,"abc@gmail.com",35);
		Person p3 = new Person(2,"abc@gmail.com",45);
		
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		
		System.out.println(hs);
		
		
	}
}
