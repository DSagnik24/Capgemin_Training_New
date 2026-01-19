package Constructor.Chaining;

public class B extends A {
	int b = 200;
	
	public void b() {
		System.out.println("b()");
	}
	static{
		System.out.println("Static init B");
	}
	B(){
		System.out.println("B constructor");
	}
}
