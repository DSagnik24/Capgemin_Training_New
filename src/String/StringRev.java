package String;

public class StringRev {
	public static void main(String[] args) {
		String s = "hello";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+= s.charAt(i);
		}
		
		System.out.println(rev);
		System.out.println(s.substring(3));
		System.out.println(s.substring(1,4));//will print from 1st to 3rd

	
	}
}
