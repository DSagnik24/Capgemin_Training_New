package Arrays;

public class Program1 {
	
	
	public static void main(String[] args) {
		int[]a = {3,4,5};
		System.err.println(a);
		
		//can store multiple datatypes only if it can type cast implicitely
		double[] d = {4.2,2.6,1};
		System.err.println(d);
		
		Student[]s = {new Student(),new Student(),null};
		System.out.println(s);
		
		Employee[] emp = {new Employee(),new Employee(),null};
		System.err.println(emp);
		
		Object[]arr = {30,40,50,60.4,"Hello",new Student(),null};
	}
}
