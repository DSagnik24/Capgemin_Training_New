package Arrays;

public class Employee {
int id;
String name;
double salary;

public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

public void display() {
	System.out.println(id);
	System.out.println(name);
	System.out.println(salary);
}

}
