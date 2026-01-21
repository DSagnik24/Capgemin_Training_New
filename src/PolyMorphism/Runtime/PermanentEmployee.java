package PolyMorphism.Runtime;

public class PermanentEmployee extends Employee{
	
	double basicSalary;
	
	public PermanentEmployee(int id, String name, double basicSalary) {
		super(id, name);
		this.basicSalary = basicSalary;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("basic salary: "+ basicSalary);
	}
	
	public double calcSalary() {
		
		return basicSalary+ (basicSalary*0.2)+(basicSalary*10);
		
	}
}
