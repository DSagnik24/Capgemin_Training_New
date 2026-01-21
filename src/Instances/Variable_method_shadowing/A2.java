package Instances.Variable_method_shadowing;

import Association.Main;

public class A2 extends A1{
	int a = 20;
	
	public void message() {
		System.out.println("A2 message()");
	}
	
	public void display() {
		System.out.println(a); // will call child class variable
		System.out.println(super.a); //will call parent class variable
		
		
		message();//child method;
		super.message();//parent method;

	}
	public static void main(String[] args) {
		A2 a2 = new A2();
		a2.display();
	}
}
