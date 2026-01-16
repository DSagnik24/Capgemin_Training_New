package Encapsulation;

public class Test {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.details();
		account.deposit(10000);
		account.details();
		account.withdraw(200);
		account.details();
	}
}
