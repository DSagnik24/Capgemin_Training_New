package Tasks;

import java.util.*;

public class ValidAnagram {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		
		HashMap<Character,Integer> hp = new HashMap<>();
		
		for(char c:s.toCharArray()) {
			hp.put(c, hp.getOrDefault(c, 0)+1);
		}
		
		for(char c:t.toCharArray()) {
			if(!hp.containsKey(c)) {
				System.out.println(false);
				return;
			}
			hp.put(c, hp.get(c)-1);
			if(hp.get(c) == 0) {
				hp.remove(c);
			}
		}
		System.out.println(hp.isEmpty());
	}
}
