package Interface_Practice;

public class Main {
	public static void main(String[] args) {
		Employee emp = new TechLead();
		
		emp.work();
		((TechLead) emp).WriteCode();
		((TechLead) emp).employeInfo();;
	}
}
