package JCF.TreeSets;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee e) {
		if(this.salary < e.salary) {
			return 1;
		}
		else if(this.salary >e.salary) {
			return -1;
		}else {
			return-this.name.compareTo(e.name);
		}
	}

	  public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
