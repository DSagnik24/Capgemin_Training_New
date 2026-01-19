package Constructor.Chaining;

public class C extends B{
int c = 300;
	
	public void c() {
		System.out.println("b()");
	}
	static {
		System.out.println("Static init C");
	}
	C(){
		System.out.println("C constructor");
	}

}
