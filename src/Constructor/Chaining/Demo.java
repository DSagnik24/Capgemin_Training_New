package Constructor.Chaining;

public class Demo {
	public Demo(double d) {
		this();//used to call demo() with no arguments
		System.out.println("Demo (D)");
	}
	
	public Demo() {
		this(10);//used to call demo() with arguments
		System.out.println("Demo()");
	}

	public Demo(int a) {
		System.out.println("Demo()");
	}
	
	public static void main(String[] args) {
		Demo d = new Demo(10.50);
	}
}
