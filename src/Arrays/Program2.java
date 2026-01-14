package Arrays;
import java.util.*;

public class Program2 {
	public static void main(String[] args) {
//		String[]arr = new String[5];
//		
//		String[]arr_new = createArray(arr);
//		
//		for(int i=0;i<arr_new.length;i++) {
//			System.out.println(arr_new[i]);
//		}
//	}
//	
//	//Design a method to create array of student and return the array;
//	static String[] createArray(String[]arr) {
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Enter Array elements: ");
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = in.nextLine();
//		}
//		
//		return arr;
//	}
		
		
		Employee[]emp = new Employee[5];
		emp[0] = new Employee(1,"A",30000);
		emp[1] = new Employee(2,"B",40000);
		emp[2] = new Employee(3,"C",50000);
		
		for(int i=0;i<3;i++) {
			emp[i].display();
		}
		
	}
}
