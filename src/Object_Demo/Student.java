package Object_Demo;

import java.util.Objects;

public class Student {
	String name;
	int phone;
	String email;
	
	
	public Student(String name, int phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}


	public boolean equals(Object obj) {

	    if ((obj instanceof Student)) {
	    	Employee e = (Employee)obj;
	    	if(this.email == e.email || this.phone == e.phone) {
	    		return true;
	    	}
	    }
	    else if(obj instanceof Student) {
	    	Student s = (Student)obj;
	    	if(this.email == s.email || this.phone == s.phone) {
	    		return true;
	    	}
	    }
	    return false;
	}
	
	
	public static void main(String[] args) {
		Student s1 = new Student("Sagnik",820251269,"abc@gmail.com");
		Employeer s2 = new Employeer("Arya",820251269,"abc@gmail.com");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
	
//	public Student(int id, String name, double percentage) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.percentage = percentage;
//	}
//	
//	public boolean equals(Object o) {
//		Student s = (Student)o;
//		
//		if(this.id == s.id) {
//			return true;
//		}
//		return false;
//	}
//
//	public static void main(String[] args) {
//		Student s1 = new Student(101,"Sagnik",90.0);
//		Student s2 = new Student(101,"Arya",100.0);
//		
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));
//	}
}
