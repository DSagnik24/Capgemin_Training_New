package Abstraction;

abstract class Test {
	
	public static void main(String[] args) {
		Payment payment = new CreditCard(50000,"SBI");
		
		payment.paymentInfo();
		payment.makePayment();
		
		Payment payment1 = new UPIPayment(7000,"G-Pay");
		
		payment1.paymentInfo();
		payment1.makePayment();
		
	}
}
