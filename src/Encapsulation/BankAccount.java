package Encapsulation;

public class BankAccount {
	int acno;
	String name;
	double balance;
	
	BankAccount() {
	}

	BankAccount(int acno, String name, double balance) {
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}

	public void details() {
		System.out.println("Account no:"+acno);
		System.out.println("Account holder name :"+name);
		System.out.println("Account Balance:"+balance);
	}
	
	public void deposit(double amt) {
		if(amt>=0) {
			balance += amt;
			System.out.println("Amount of "+amt+"Credited to your Account");
			System.out.println("Current Balance "+ balance);
		}
		else {
			System.out.println("Invalid amount transfer");
		}		
	}
	
	public void withdraw(double amt) {
		if(amt <= balance) {
			balance -= amt;
			System.out.println("Amount of "+ amt + "Debited from your Account");
			System.out.println("Current Balance " +balance);
		}else {
			System.out.println("Invalid amount transfer");
		}
	}
}
