package OOP.Fundamentals.non_Static;

public class Program4 {
	int i = 3;
	static String s = "Sagnik";
	
	public static void main(String[] args) {
		Program4 obj1 = new Program4();
		obj1.i = 20;
		System.out.println(obj1.i);
		Program4 obj2 = new Program4();
		System.out.println(obj2.s);
	}
}
