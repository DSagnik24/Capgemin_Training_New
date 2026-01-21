package PolyMorphism.Runtime;

public class Test {
	public static void main(String[] args) {
		Lion l1 = new Lion();
		l1.sound();
		
		Dog dogesh = new Dog();
		dogesh.sound();
		
		Animal an1 = new Lion();
		an1.sound();
		
		Animal an2 = new Dog();
		an2.sound();
	}
}
