package Object_Demo;

public class Employee {
	int id;
	public String email;
	public int phone;
	

	public Employee(int id, String email, int phone) {
		super();
		this.id = id;
		this.email = email;
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", email=" + email + ", phone=" + phone + "]";
	}




	public static void main(String[] args) {
		Employee emp = new Employee(101,"Sagnik",10000);
		System.out.println(emp);
	}
}
