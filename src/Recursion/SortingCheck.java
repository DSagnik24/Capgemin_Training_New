package Recursion;

public class SortingCheck {
	public static void main(String[] args) {
		int[]arr = {0,1,2,3,4,5,6,7,8,99,1000};
		
		System.out.println(check(arr,0));
	}
	static boolean check(int[]arr,int index) {
		if(arr.length-1==index) return true;
		if(arr[index] > arr[index+1]) return false;
		return check(arr,index+1);
	}
}
