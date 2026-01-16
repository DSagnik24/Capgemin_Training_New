package Constructor;

public class Test {
	static void demo(Test obj) {
		System.out.println("demo()");
		System.out.println(obj);
		obj.test();
	}
	public static void main(String[] args) {
		demo(new Test());
		//demo(null);
	}
	void test() {
		System.out.println("test()");
	}
}
