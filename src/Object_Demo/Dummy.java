package Object_Demo;

public class Dummy {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		Dummy d1 = new Dummy();
		Dummy d2 = new Dummy();
		
		System.out.println(a==b);//compares values for primitive datatypes
		System.out.println(d1==d2);//compares obj reference for non-primitive datatypes
		
		System.out.println(d1.equals(d2));
	}
}
