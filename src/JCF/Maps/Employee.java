package JCF.Maps;

import java.util.Objects;

public class Employee {
	
	int id;
	String name;
	double salary;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		if(this.id == emp.id) {
			return true;
		}else{
			return false;
		}
	}
	
	

}
