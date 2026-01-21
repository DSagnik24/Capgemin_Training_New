package Instances.Shadowing_MultiLevel;

public class B3 extends B2{
	int b = 30;
	public void method1() {
		System.out.println("B3 method");
	}
	public void display() {
		System.out.println(b);//access B3
		System.out.println(super.b); // access B2
		System.out.println(((B1)this).b);//access B1
	}
	public void dispMethod() {
		method1();
		super.method1();
		((B1)this).method2(); // wont work for 
	}
	public static void main(String[] args) {
		B3 b3 = new B3();
		b3.display();
		B1 b1 = new B1();
		
		
		b3.dispMethod();
//		b1.method1();
	}
}
