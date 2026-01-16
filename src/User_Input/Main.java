package User_Input;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter data 1: ");
		byte b = in.nextByte();
		System.out.println(b);
		
		String s = in.next();
		System.out.println(s);
		
		
	}
	
}
