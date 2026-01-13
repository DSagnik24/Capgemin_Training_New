package OOP.StaticInitializer;

public class Program1 {
	
	static int a = test(); //single line initializer 
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println(a);
		System.out.println("Main End");
	}
	
	static int test() {
		System.out.println("Test");
		System.out.println(a);
		return 10;
		
	}
	
}
