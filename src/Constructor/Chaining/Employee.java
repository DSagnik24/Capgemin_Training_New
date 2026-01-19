package Constructor.Chaining;

public class Employee extends Person{
		double salary;
        
        public Employee(int id, String name, double salary) {
			super(name,id);
			this.name = name;
			this.salary = salary;
		}

        public void displayEmp() {
        	displayPerson();
        	System.out.println(this.salary);
        }

}
