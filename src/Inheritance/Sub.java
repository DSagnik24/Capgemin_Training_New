package Inheritance;

public class Sub extends Super{
	static int j = 20;
	
	static void test() {
		System.out.println("test()");
	}
	static {
		System.out.println("SUb class static block");
	}
	public static void main(String[] args) {
		
	}
}
