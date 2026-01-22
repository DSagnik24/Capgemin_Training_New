
package Exceptions.Tasks;

public class Main {

    public static void main(String[] args) throws InvalidAgeException {

        Student s = new Student();

        s.setName(null);
        if (s.getName() == null || s.getName().isEmpty()) {
            throw new InvalidNameException("Name is empty");
        }

        s.setAge(10);
        if (s.getAge() <= 0) {
            throw new InvalidAgeException("Invalid age");
        }

        System.out.println("Student details are valid");
    }
}
