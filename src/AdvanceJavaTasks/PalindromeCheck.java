package AdvanceJavaTasks;

public class PalindromeCheck {
	public static void main(String[] args) {
		String s1 = "racecar";
		String s2 = "racecar";
		check(s1,s2);
		
	} 
	static void check(String s1,String s2) {
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		
		System.out.println(sb1.reverse().equals(sb2)? "True":"False");
		
	}
}
