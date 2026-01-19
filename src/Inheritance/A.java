package Inheritance;

public class A {
	static int a = 100;
	
	public static void main(String[] args) {
		System.out.println("A main()");
	}
	
	static {
		System.out.println("A static init");
	}
	public static void a() {
		System.out.println("a()");
	}
}
