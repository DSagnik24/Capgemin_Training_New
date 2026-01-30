package OOPS_Questions.OnlineBank;

import OOPS_Questions.OnlineBank.OnlineBank.InsufficientBalanceException;

public abstract class Account implements Transaction {
	
	private double balance;
	
	protected int accNumber;
	protected String  holderName;
	protected String accountTYpe;
	
	public Account(double balance, int accNumber, String holderName, String accountType) {

		this.balance = balance;
		this.accNumber = accNumber;
		this.holderName = holderName;
		this.accountTYpe = accountType;
		
	}

	public double getBalance() {
		return balance;
	}

	protected double updateBalance(double amount) {
		return this.balance += amount;
	}
	
	public abstract void withdraw(double amount)
	throws InsufficientBalanceException;
	
	
	
}
