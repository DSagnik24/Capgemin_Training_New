package OOP.Fundamentals.non_Static;

public class Student {
	String name;
	
	int id;
	double per;
	
	public Student(String name, int id,double per) {
		this.name = name;
		this.id = id;
		this.per = per;
	}

	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("%: "+per);
	}
}
