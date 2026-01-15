package AdvanceJavaTasks;

import java.util.*;

public class FrequencyCount {
	 public static void countFrequency(int[] arr) {
	        Map<Integer, Integer> map = new HashMap<>();

	        for (int num : arr) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
	            System.out.println(e.getKey() + " : " + e.getValue() + " times");
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {1,2,3,4,1,2,3,4,5,1,2,3,4,5,5};
	        countFrequency(arr);
	    }
}
