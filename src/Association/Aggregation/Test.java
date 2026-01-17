package Association.Aggregation;

public class Test {
	public static void main(String[] args) {
		
		Person p= new Person();
		p.setAge(22);
		p.setGender("Male");
		p.setName("Sagnik");
		System.err.println(p.getAge());
		System.err.println(p.getName());
		System.err.println(p.getGender());
		
		System.out.println("Passport " + p.getPassport());
		
		p.applyPassport("SagnikD","30/09/2003","Male");
		System.out.println("Passport " + p.getPassport());
	}
}
