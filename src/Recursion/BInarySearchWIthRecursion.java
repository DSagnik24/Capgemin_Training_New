package Recursion;

public class BInarySearchWIthRecursion {
	public static void main(String[]args) {
		int[] targets = {0, 2, 99998, 100000, 150000, 199998, 200000};
		int target = 150000;
		
		System.out.println(searching(targets,target,0,targets.length-1));
	}
	static int searching(int[]arr, int target,int s,int e) {
		if(s>e) {
			return -1;
		}
		int m = s+(e-s)/2;
		
		if(arr[m] == target) {
			return m;
		}else if(arr[m]>target) {
			return searching(arr,target,s,m-1);
		}else {
			return searching(arr,target,m+1,e);
		}
	}
}
