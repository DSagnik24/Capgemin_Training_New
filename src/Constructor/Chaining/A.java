package Constructor.Chaining;

public class A {
	int a = 100;
	public void a() {
		System.out.println("a()");
	}
	
	{
		System.out.println("Non- Static init A");
	}
	public A() {
	    System.out.println("A constructor");	
	}
}
