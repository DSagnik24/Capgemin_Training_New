package PracticeQuestions;

import java.util.*;

public class IncrementByOne {
	public static void main(String[] args) {
		int[] digits = {1,2,3};
		int[] digits2 = {9,9,9};
		
		System.out.println(Arrays.toString(expand(digits2)));
		
	}
	
	static int[] expand(int[]arr) {
		int n = arr.length-1;
		
		for(int i=n;i>=0;i--) {
			if(arr[i] < 9) {
				arr[i]++;	
				return arr;
			}
			arr[i] = 0;
		}
		
		int[]res = new int[n+2];
		res[0] = 1;
		return res;
	}
}
