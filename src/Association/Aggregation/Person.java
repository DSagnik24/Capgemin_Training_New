package Association.Aggregation;

public class Person {
	
	private Passport passport; // Object Instance
	
	private String name;
	private int age;
	private String gender;
	
	public void applyPassport(String id, String dob, String expdate) {
		passport = new Passport();
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
