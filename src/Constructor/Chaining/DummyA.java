package Constructor.Chaining;

public class DummyA {
	static String a1  = "a1 variable";
	
	public static void a1() {
		System.out.println("static a1()");
	}
	
	static {
		System.out.println("Dummy A static init");
	}
	String a2 = "a2 variable";
	
	public void a2() {
		System.out.println("non Static a2()");
	}
	{
		System.out.println("Dummy A non static init");
	}
	
	public DummyA() {
		super();
		System.out.println("Dummy A constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Dummy A main");
	}
}
