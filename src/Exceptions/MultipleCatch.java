package Exceptions;

public class MultipleCatch {
	public static void main(String[] args) {
		System.out.println("Program start");
		
//		try {
//			System.out.println(100/0);
//		}catch(ArithmeticException e) {	
//		}
//		
//		try {
//			String s = null;
//			System.out.println(s.length());
//			}catch(NullPointerException e) {
//				
//			}
//		try {
//			int[]arr = new int[2];
//			System.out.println(arr[5]);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			
//		}
		
		try {
			System.out.println(100/0);
			
			String s = null;
			System.out.println(s.length());
			
			int[]arr = new int[2];
			System.out.println(arr[5]);
			
		}
		catch(ArithmeticException e) {	
			System.out.println(e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program ended");
		
	}

}
