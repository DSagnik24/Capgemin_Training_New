package variables;

public class FloatConversion { //4 byte
	public static void main(String[]args) {
		
		float f = -35;
		
		short s = (short)f;
        long b = (long)f;
        int a = (int)f;
		byte by = (byte)f;
		double d = f;
		char c = (char)f;
		 
		System.out.println(by);
		System.out.println(b);
		System.out.println(s);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
	}
}
