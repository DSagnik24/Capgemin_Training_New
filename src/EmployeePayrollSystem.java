interface Payroll {
    double calculatePay();
}

class UnauthorizedAccessException extends RuntimeException {
    UnauthorizedAccessException(String msg) { 
    	super(msg); 
    	}
}

class InvalidSalaryException extends Exception {
    InvalidSalaryException(String msg) { 
    	super(msg); 
    	}
}

abstract class Employee implements Payroll {

    private int id;
    private String name, role;
    private double salary;

    Employee(int id, String name, String role, double salary)
            throws InvalidSalaryException {
        if (salary <= 0) throw new InvalidSalaryException("Salary must be positive");
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    protected double getSalary() {
    	return salary; 
    	}
    public String getName() { 
    	return name;
    	}

    public void updateSalary(String requester, double sal)
            throws InvalidSalaryException {
        authorize(requester);
        validate(sal);
        salary = sal;
    }

    public void updateSalary(String requester, double sal, double bonus)
            throws InvalidSalaryException {
        updateSalary(requester, sal + bonus);
    }

    private void authorize(String r) {
        if (!"HR".equalsIgnoreCase(r))
            throw new UnauthorizedAccessException("Only HR can modify salary");
    }

    private void validate(double s) throws InvalidSalaryException {
        if (s <= 0) throw new InvalidSalaryException("Invalid salary");
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(int id, String n, String r, double s)
            throws InvalidSalaryException {
        super(id, n, r, s);
    }
    public double calculatePay() { return getSalary(); }
}

class ContractEmployee extends Employee {
    private int hours;
    private double rate;

    ContractEmployee(int id, String n, String r, int h, double rt)
            throws InvalidSalaryException {
        super(id, n, r, 1);
        hours = h;
        rate = rt;
    }
    public double calculatePay() { return hours * rate; }
}

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        try {
            Employee e1 = new FullTimeEmployee(101, "Sagnik", "Dev", 50000);
            Employee e2 = new ContractEmployee(102, "Raj", "Contract", 160, 500);

            System.out.println(e1.getName() + " Pay: " + e1.calculatePay());
            System.out.println(e2.getName() + " Pay: " + e2.calculatePay());

            e1.updateSalary("HR", 55000, 5000);
            System.out.println("Updated Pay: " + e1.calculatePay());

            e1.updateSalary("Dev", 60000);

        } catch (InvalidSalaryException | UnauthorizedAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
