package Constructor;

public class Test1 {
	static int count = 0;
	
	//factory method ==> only applicable for methods creating objects
	public static Test1 m1() {
		System.out.println("m1()");
		return new Test1();
	}
	{
		count ++;
	}
	public static void main(String[] args) {
		Test1 obj1 = m1();
		
		//Method chaining
		obj1.m2().m3();
		System.out.println(count);
		
		String s = "HelloJava";
		// Here we also use string reference and not create another object
	
		System.out.println(s.substring(2).toUpperCase().replaceAll("[A-Z]", "1"));
		//s.charAt(1).toUpperCase(); --> this cant be created as charAt returns character array
	}
	//not factory method as it return object reference 
	public Test1 m2() {
		System.out.println("m2()");
		return this;
	}
	
	public Test1 m3() {
		System.out.println("m3()");
		return this;
	}
}
