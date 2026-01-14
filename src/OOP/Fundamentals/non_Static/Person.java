package OOP.Fundamentals.non_Static;

public class Person {
	
	String name;
	int age;
	String gender;
	
	Person(){
		System.out.println("No Args Constructor");
	}
	Person(int a){
		System.out.println("Int a");
	}
	
	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
//	public void initialize(String name, int age, String gender) {
//		
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	}
	
}
