package Constructor.Chaining;

public class Person {
	String name;
	int id;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	 public void displayPerson() {
     	System.out.println(this.id);
     	System.out.println(this.name);
     }
	
	
}
