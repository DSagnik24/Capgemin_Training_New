package Method;

public class Nprogram {
	public static void main(String[] args) {
		num(1,2,3);
		num('a',20.5);
	}
	//Method overLoading
    static void num(char a, char b) {
    	System.out.println("char, char");
	}
	static int num(int a,int b,int c) {
		//implementation and not method body
		return a+b+c;
	}
	static void num(int a,int b) {
	System.out.println(a+b);	
}
	static void num(double a, double b) {
		System.out.println("double,double");
	}

   static void num(char a, double b) {
   	System.out.println("char, double");
	}
    
}
