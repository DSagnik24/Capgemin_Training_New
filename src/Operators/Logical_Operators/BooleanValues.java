package Operators.Logical_Operators;

public class BooleanValues {
	public static void main(String[]args) {
		//&& operators
		int a = 5;
		
		System.out.println(a>10 && ++a > a);
		System.out.println( a);
		
		// || operators
		
		System.out.println(false || true || false);
		
		int b = 6;
		System.out.println( b> 10 || ++b>10 );
		System.out.println( b);
		
	}
}
