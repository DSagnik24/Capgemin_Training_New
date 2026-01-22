package Abstraction;

class B extends  A {
	public void test() {
		System.out.println("B impl");
	}

	public void testB() {
		System.out.println("B impl");
		System.out.println(("Test Method"));
	}
	
	public static void main(String[] args) {
		A a = new B();
		a.test();
		a.testA();
		
		B b  = (B)a;
		b.test();
		b.testA();
	}
	
}
