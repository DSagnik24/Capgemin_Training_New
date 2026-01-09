package variables;

public class IntConversion { // 4 byte
	public static void main(String[]args) {

		int a = 40;
		
		byte by = (byte)a;
		long b = a;
		short s = (short)a;
		float f = a;
		double d = a;
		char c = (char)a;
		 
		System.out.println(by);
		System.out.println(b);
		System.out.println(s);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
	}
}
