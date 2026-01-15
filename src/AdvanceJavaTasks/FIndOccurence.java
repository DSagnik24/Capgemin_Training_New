package AdvanceJavaTasks;

import java.util.*;

public class FIndOccurence {
	public static void main(String[] args) {
		
		String s1 = "HELLO";
		printOccurence(s1);
		
		
	}
	static void printOccurence(String s1) {
		HashMap<Character ,Integer> map1 = new HashMap<>();

		
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
			map1.put(ch,map1.getOrDefault(ch, 0)+1);
		}
	
		
		System.out.println(map1);
	}
}
