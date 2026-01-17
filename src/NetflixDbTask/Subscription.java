package NetflixDbTask;

public class Subscription {
	private double amount;
	private String endDate;
	private int noOfDevices;
	
	public Subscription() {
		
	}
	
	public Subscription(double amount, String endDate, int noOfDevices) {
		super();
		this.amount = amount;
		this.endDate = endDate;
		this.noOfDevices = noOfDevices;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getNoOfDevices() {
		return noOfDevices;
	}

	public void setNoOfDevices(int noOfDevices) {
		this.noOfDevices = noOfDevices;
	}
	
	
	
}
