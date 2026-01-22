package Exceptions;

public class Bank {
	public static double balance = 10000;
	
	public static void debit(double amount) throws InvalidAmountException{
		if(amount > balance) {
			throw new InvalidAmountException("Amount is greater than balance");
		}
		else {
			balance = balance - amount ;
			System.out.println("amount debited");
		}
	}
	public static void main(String[] args) {
		try {
			debit(3000);
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Program ended");
	}

}
