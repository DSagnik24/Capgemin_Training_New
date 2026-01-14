package OOP.StaticInitializer;

public class Program1 {
	
	static int a = 20;//single line initializer 

	static { //multi-line initializer
		a = 30;
		a = test();
	}
	
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
