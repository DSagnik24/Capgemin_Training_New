package Association.Aggregation;

public class Passport {
	private String id;
	private String dob;
	private String expdate;
	
	Passport(){
		
	}
	
	Passport(String id, String dob, String expdate){
		this.dob = dob;
		this.id = id;
		this.expdate = expdate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getExpdate() {
		return expdate;
	}
	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	
	
}
