package AdvanceJavaTasks;
import java.util.*;

public class ValidAnagram {
	public static void main(String[] args) {
		String s1 = new String("listen");
		String s2 = new String("silent");
		
	System.out.println(anagramCheck(s1,s2));

	}
	static Boolean anagramCheck(String s1, String s2) {
		if(s1.length() != s2.length()) return false;
	
		
		char[]arr1 = s1.toCharArray();
		char[]arr2 = s2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = 0; i < arr1.length-1; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
		
		
		
//		return (set1.equals(set2));
	}
}
