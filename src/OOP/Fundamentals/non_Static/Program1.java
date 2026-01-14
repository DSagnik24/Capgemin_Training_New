package OOP.Fundamentals.non_Static;

public class Program1 {
	//Non-static/Instance/object variables
	int a = 67 ;
	double d;
	byte b;
	String s;
	public static void main(String[] args) {

		Program1 p = new Program1(); 
		System.out.println(p);
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.s);
		System.out.println(p.d);
		
		p.a = 0;
		p.s = null;
		
	}
}
