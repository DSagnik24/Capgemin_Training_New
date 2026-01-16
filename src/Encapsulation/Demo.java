package Encapsulation;

public class Demo {
	//private variable global var,method,Constructor
	//class Initializer not used 
	// Constructor ---> object 
	Demo(){
		
	}
	private int a;
	// write value , read the value
	
	//method write design setter method
	//read the value design getter method
	
	public int getValueA() {
		return a;
	}
	
	public void setValueA(int a) {
		this.a=a;
	}
	// Factory Method
	static Demo object; // stores null/ref
	public static Demo getA() {
		if(object == null) { // here only once the object is created, after creation if wont stay null.
			// if it wont stay null, below line wont be generated and thus it no new object will be created
			object = new Demo();
		}
		return object;
	}
//	public static Demo getB() {
//		return ;
//	}
}
