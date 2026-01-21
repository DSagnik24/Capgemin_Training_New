package PolyMorphism;

public class AreaCalculator {
	
	static double calcuArea(double side) {
		return side*side;
	}
	
	static double calcuArea(double length,double breadth) {
		return length*breadth;
	}
	
	static float calcuArea(float rad) {
		return  3.14f*rad *rad;
	}
}
