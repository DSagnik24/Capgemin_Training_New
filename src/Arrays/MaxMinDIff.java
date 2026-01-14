package Arrays;
import java.util.*;

public class MaxMinDIff {
	public static void main(String[] args) {
		int[]arr = {5,6,2,1};
		
		Arrays.sort(arr);
		
		int diff = arr[arr.length-1] -arr[0];
		System.out.println(diff);
	}
	
}
