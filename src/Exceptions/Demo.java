package Exceptions;


public class Demo {
	public static void main(String[] args) {
		
		System.out.println("Started");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		catch(Throwable e) {
      		System.out.println(e.getMessage());
		}
		
		
		System.out.println("Stopped");
	}
}
