package Constructor.Chaining;

public class DummyB extends DummyA{
	static String b1 = "b1 var";
	
	public static void b1() {
		System.out.println("Static b1()");
	}
	
	static {
		System.out.println("Dummy B static init");
	}
	
	String b2 = "b2 var";
	
	public void b2() {
		System.out.println("Non- static block b2()");
	}
	{
		System.out.println("Dummy B non-static init");
	}
	public DummyB() {
		super();
		System.out.println("Dummy B constructor");
	}
	public static void main(String[] args) {
		DummyB db =new DummyB();
		System.out.println("main Dummy B");
		System.out.println(a1);
		a1();
		//a2();//non static --> so wont work
		db.a2();
		
	}
}
