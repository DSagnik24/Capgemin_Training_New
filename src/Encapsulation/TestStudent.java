package Encapsulation;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setName("Sagnik");
		s1.setId(1);
		s1.setCgpa(8.9);
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getCgpa());
	}
}
