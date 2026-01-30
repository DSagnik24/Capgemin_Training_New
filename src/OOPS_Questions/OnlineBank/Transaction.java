package OOPS_Questions.OnlineBank;

import OOPS_Questions.OnlineBank.OnlineBank.InsufficientBalanceException;

public interface Transaction {
	void deposit(double amount);
	void withdraw(double amount) throws InsufficientBalanceException;
}
