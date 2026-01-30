package Tasks;
import java.util.*;
public class GroupAnagrams {
	public static void main(String[] args) {
		 String[] strs = {"eat","tea","tan","ate","nat","bat"};
		 
		 Map<String,List<String>> map = new HashMap();
		 
		 for(String word:strs) {
			 char[]arr = word.toCharArray();
			 Arrays.sort(arr);
			 
			 String key = new String(arr);
			 
			 map.putIfAbsent(key, new ArrayList<>());
			 map.get(key).add(word);
		 }
		 
		 List<List<String>>res = new ArrayList<>(map.values());
		 System.out.println(res);
	}
}
