package Abstraction;

 class CreditCard extends Payment{
	
	String creditCompany;


	public CreditCard(double amount,String creditCompany) {
		super(amount);
		this.creditCompany = creditCompany;
	
	}
	
	public void PaymentInfo() {
		super.paymentInfo();
		System.out.println("Company: "+creditCompany);
	}
	@Override
	public void makePayment() {
		System.out.println("Payment done using credit card");
	}

}
