package OOP.Fundamentals.non_static_initializer;

public class Program1 {

	static {
		System.out.println("Block1");
	}
	
	{
		System.out.println("non-static Block3");
	}
	
	public static void main(String[] args) {
		System.out.println("Main");
		new Program1(); // Number of object == number of non-static blocks called
		new Program1();

	}
	
	static {
		System.out.println("Block2");
	}
	
}
