package String;

public class Regex {
	public static void main(String[] args) {
		
		System.out.println("aBc69".matches("[a-zA-Z0-9]+"));
		System.out.println("abc".matches("[a-z]"));
		System.out.println("abc".matches("[a-z]+")); //+ ==> applicable for more than 1 char
		
		System.out.println("236258268264275".matches("[6-9][0-9]+"));
	}
}
