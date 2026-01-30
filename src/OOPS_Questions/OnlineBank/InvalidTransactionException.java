package OOPS_Questions.OnlineBank;

public class InvalidTransactionException extends RuntimeException{
	public InvalidTransactionException(String message) {
		super(message);
	}
}
