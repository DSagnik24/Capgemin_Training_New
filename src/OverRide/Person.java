package OverRide;

import java.util.Objects;

public class Person {
	int id;
	String email;
	int age;
	
	public Person(int id,String email,int age) {
		this.id= id;
		this.email = email;
		this.age = age;
		
   }

	public String toString() {
		return "Person [id=" + id + ", email=" + email + ", age=" + age + "]";
	}


	public int hashCode() {
		return Objects.hash(id,email);
	}
	
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		if((this.id == p.id) && (this.email == p.email)){
			return true;
		}
		return false;
	}
	
}
