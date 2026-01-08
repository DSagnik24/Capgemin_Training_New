package variables;

public class Type_Casting {
	public static void main(String[]args) {
		char c = 'A'; // 2 bytes
		int i = c; // no problem as 4 bytes and its gonna take ascii value
		
		System.out.println(i);
		
		//implicit Typecasting --> widening  (char to int)
		//explicit Typecasting --> narrowing (int to char)
		int j = 65;
		
		char ch = (char) j;   //TypeCast
		System.out.println(j);
		
		long la = i;
		System.out.println(la);
		
		i = (int)la;
		System.out.println(i);
		
	}
}
