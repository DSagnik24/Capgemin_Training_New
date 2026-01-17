package PracticeQuestions;
import java.util.*;

public class RotateUsingReverse {
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		
		k%=arr.length;
		
		reverse(arr,0,arr.length-1);
		
		reverse(arr,0,arr.length-k-1);
		
		reverse(arr,arr.length-k,arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
	public static void reverse(int []arr,int start,int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start ++;
			end --;
		}
	}
	
}
