package HashSets;

import java.util.Objects;

public class Employee {

    int id;
    String name;
    double salary;

    // ✅ Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // ✅ toString()
    @Override
    public String toString() {
        return "Employee{id=" + id +
               ", name='" + name + '\'' +
               ", salary=" + salary +
               '}';
    }

    // ✅ hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    // ✅ equals()
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee e = (Employee) obj;

        return id == e.id &&
               Double.compare(e.salary, salary) == 0 &&
               Objects.equals(name, e.name);
    }
}
