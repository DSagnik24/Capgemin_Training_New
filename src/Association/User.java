package Association;

public class User {
	private String name;
	private String email;
	private String dob;
	private Subscription sub;
	private Account acc;
	
	public User(String name, String email, String dob, Subscription sub, Account acc) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.sub = sub;
		this.acc = acc;
	}
	
	  public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getDob() {
	        return dob;
	    }

	    public Subscription getSubscription() {
	        return sub;
	    }

	    public Account getAccount() {
	        return acc;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public void setDob(String dob) {
	        this.dob = dob;
	    }

	    public void setSubscription(Subscription subscription) {
	        this.sub = subscription;
	    }

	    public void setAccount(Account account) {
	        this.acc = account;
	    }
	
}
