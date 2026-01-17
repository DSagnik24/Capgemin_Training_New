package NetflixDbTask;

public class User {
	private String name;
	private String email;
	private String dob;
	
	private Subscription[] subs;
	
	public User() {
		
	}

	public User(String name, String email, String dob, Subscription[] subs) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.subs = subs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Subscription[] getSubs() {
		return subs;
	}

	public void setSubs(Subscription[] subs) {
		this.subs = subs;
	}
	
	

}
