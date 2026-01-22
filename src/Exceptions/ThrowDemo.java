package Exceptions;

public class ThrowDemo {
	
	public static void vote(int age) {
		if(age >= 18) {
			System.out.println("Can vote");
		}
//		else {
//			throw new ArithmeticException();
//		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Candidate went for voting");
		try {
			vote(21);
		}catch(Throwable t) {
			System.out.println("Candidate cannot vote");
		}
		System.out.println("Candidate came home");
	}
}
