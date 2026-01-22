package Interface_Practice;

public abstract class Employee {
	int id;
	String name;
	
	public void employeInfo() {
		System.out.println("id , name");
	}
	
	public abstract void work();
}
