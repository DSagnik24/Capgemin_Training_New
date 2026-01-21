package PolyMorphism.Runtime;

import java.util.*;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no of employees to add: ");
        int n = in.nextInt();
        in.nextLine();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter employee id: ");
            int id = in.nextInt();
            in.nextLine();

            System.out.println("Enter employee name:");
            String name = in.nextLine();

            System.out.println("1. Permanent Emp");
            System.out.println("2. Payroll Emp");
            System.out.println("Choose option:");
            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter basic Salary:");
                    double sal = in.nextDouble();
                    emp[i] = new PermanentEmployee(id, name, sal);
                    break;

                case 2:
                    System.out.println("Enter the hours:");
                    int hrs = in.nextInt();
                    System.out.println("Enter the rate:");
                    double rate = in.nextDouble();
                    emp[i] = new PayRollEmployee(id, name, hrs, rate);
                    break;

                default:
                    System.out.println("Invalid choice, re-enter employee");
                    i--; // retry
            }
        }

        // Runtime Polymorphism happens here
        for (Employee em : emp) {
            em.displayDetails();
            em.calSalary();
        }

        in.close();
    }
}
