package Interfaces;

public class Demo implements I2{
	public static void main(String[] args) {
		I2 i1 = new Demo();
		
		//I2.testA();
		I2.testB();
		//I2.testC();
	}

	@Override
	public void testA() {
		System.out.println("Demo TestA()");
	}
	
	public void testB() {
		System.out.println("Demo TestB()");
	}
	
	public void testC() {
		System.out.println("Demo TestC()");
	}
}
