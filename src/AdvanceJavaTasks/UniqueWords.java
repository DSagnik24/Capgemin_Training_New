package AdvanceJavaTasks;

import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        String str = "hello world hello java java  world";
        
        withoutMap(str);
        
//        
//        String[] words = str.split(" ");
//
//        Map<String, Integer> map = new HashMap<>();
//
//        for (String word : words)
//            map.put(word, map.getOrDefault(word, 0) + 1);
//
//        for (String word : map.keySet()) {
//            if (map.get(word) == 1)
//                System.out.print(word + " ");
//            
//            
            
        }
    }
    
    static void withoutMap(String str) {
    	String []words = str.split(" ");
    	
    	boolean[]visited = new boolean[words.length];
    	
    	for (int i = 0; i < words.length; i++) {
			if(visited[i]) continue;
			
			int count =1;
			for (int j = 0; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					visited[j] = true;
					count++;
				}
			}
			
			if(count ==1) {
				System.out.println(words[i]);
			}
		}
    }
}

