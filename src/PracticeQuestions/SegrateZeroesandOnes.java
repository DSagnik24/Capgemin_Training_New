package PracticeQuestions;

import java.util.*;
	
public class SegrateZeroesandOnes {
	public static void main(String[] args) {
		int []arr = {0, 1, 0, 1, 0, 0, 1, 1, 0, 1};
		
		System.out.println(Arrays.toString(arrange(arr)));
	}
	static int[] arrange(int[]arr) {
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 1)count++;	
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(i < count) {
				arr[i] =1;
			}else {
				arr[i] = 0;
			}
		}
		return arr;
	}
}
