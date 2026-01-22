package Exceptions;

public class CheckedExceptionDemo {
	public static void main(String[] args) throws ClassNotFoundException{
		
		System.out.println("Program started");
		
		Class.forName("");
		
		System.out.println("Program ended");
		
	}
}
