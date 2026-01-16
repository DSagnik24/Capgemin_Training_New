package AdvanceJavaTasks;

public class PalindromeCheck {
	public static void main(String[] args) {
		String s1 = "racecar";
		check(s1);
		
	} 
	static void check(String s1) {
		String rev = "";
		for(int i=s1.length()-1;i>=0;i--) {
			rev += s1.charAt(i);
		}
		System.out.println(s1.equals(rev)?"Palindrome":"Not Plaindrome");
	}
}
