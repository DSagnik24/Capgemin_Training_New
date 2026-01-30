package OOPS_Questions.OnlineBank;

import OOPS_Questions.OnlineBank.OnlineBank.InsufficientBalanceException;

public  class SavingsAccount extends Account{
	
	private static final double MIN_BALANCE = 1000;

	public SavingsAccount(double balance, int accNumber, String holderName, String accountTYpe) {
		super(balance, accountType, holderName, accNumber);
	}
	
	public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= 0)
            throw new InvalidTransactionException("Invalid withdrawal amount");

        if (getBalance() - amount < MIN_BALANCE)
            throw new InsufficientBalanceException(
            		"Minimum balance must be maintained "+ MIN_BALANCE);

        setBalance(getBalance() - amount);
        System.out.println("Savings withdrawal successful");
    }
	
}
