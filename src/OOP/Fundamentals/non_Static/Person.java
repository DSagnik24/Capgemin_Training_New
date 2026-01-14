package OOP.Fundamentals.non_Static;

public class Person {
	
	String name;
	int age;
	String gender;
	
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void initialize(String name, int age, String gender) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	}
	
}
