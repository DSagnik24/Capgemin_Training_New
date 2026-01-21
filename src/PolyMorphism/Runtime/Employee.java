package PolyMorphism.Runtime;

public class Employee {
	int id;
	 String name;
	 
	 public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	 }
	 
	 public void displayDetails() {
		 System.out.println(this.id);
		 System.out.println(this.name);
	 }
	 
	 public double calSalary(){
		 return 0.0;
	 }
	 
	 
}
