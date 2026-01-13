package Recursion;

public class SubsetGeneration {
	public static void main(String[] args) {
		String str = "ab";
		String ans = " ";
		subsets(str,ans);
	}
	
	static void subsets(String str, String ans) {
		if(str.isEmpty()) {
			System.out.println(ans);
			return;
		}

		char ch = str.charAt(0);
		
		// include character
		subsets(str.substring(1),ans+ch);
		
		// exclude character
		subsets(str.substring(1),ans);
	}
}
