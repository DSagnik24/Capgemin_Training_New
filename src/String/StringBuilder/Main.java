package String.StringBuilder;

public class Main {
	public static void main(String[] args) {
		//Mutable and can be used to update old Strings
		
		StringBuilder sb = new StringBuilder(); // can store upto 16 characters
		System.out.println(sb.length());
		sb.append("12345678901234");
		System.out.println(sb.capacity());
		sb.append("1234567890123434633733"); //capacity increases from 16*2 + 2
		System.out.println(sb.capacity());
		
	}
}
