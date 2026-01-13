package Recursion;

public class RemoveCharacter {
	public static void main(String[] args) {
		String s ="bananas";
		
		System.out.println(removeChar(s));
	}
	static String removeChar(String str) {
		if(str.isEmpty()) return "";
		
		char ch = str.charAt(0);
		
		if(ch == 'a')
			return removeChar(str.substring(1));
		else 
			return ch + removeChar(str.substring(1));
	}
}
