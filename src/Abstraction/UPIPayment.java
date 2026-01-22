package Abstraction;

class UPIPayment extends Payment {
	
	String App;
	
	public UPIPayment(double amount,String App) {
		super(amount);
		this.App= App;
	}
	public void PaymentInfo() {
		super.paymentInfo();
		System.out.println("App: "+App);
	}
	@Override
	public void makePayment() {
		System.out.println("Payment done using UPI");
	}
	
	

}
