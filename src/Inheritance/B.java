package Inheritance;

public class B extends A {
	static int a = 500;
	
	static void b() {
		System.out.println("B()");
	}
	
	static {
		System.out.println("B static init");
	}
	
	public static void main(String[] args) {
		System.out.println("B main()");
	}
}
