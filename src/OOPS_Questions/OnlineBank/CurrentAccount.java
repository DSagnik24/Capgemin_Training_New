package OOPS_Questions.OnlineBank;

import OOPS_Questions.OnlineBank.OnlineBank.InsufficientBalanceException;

public class CurrentAccount extends Account{
	private static final double OVERDRAFT_LIMIT = 5000;

	
	public CurrentAccount(double balance, int accNumber, String holderName, String accountTYpe) {
		super(balance, accNumber, accountTYpe, holderName);
	}
	
	public void withdraw(double amount) 
	throws InsufficientBalanceException{
		if(amount <= 0)
			throw new InvalidTransactionException("Withdrawal must be greater than 0");
		
		if(amount  > getBalance() + OVERDRAFT_LIMIT)
			throw new InvalidTransactionException(
					"OverDraft limit exceeded");
	
		updateBalance(getBalance() - amount);
		System.out.println("Current withdrawl success, Balance "+getBalance());
		
	}

}
