package Operators.Logical_Operators;

public class Main {
	public static void main(String[]args) {
		int a = 10;
		
		//Pre increment  and post increment

		System.out.println(a++); // Displays the value then updates its
		System.out.println(++a);// Updates the value the Display
		System.out.println(a);
		
		int b = 2;
		int c = b++ + 30;
		int d = c++ + b++;
		System.out.println(b);
		System.out.println(c);
		System.out.print(d);
		
	}

}
