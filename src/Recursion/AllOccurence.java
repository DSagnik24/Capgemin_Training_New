package Recursion;

public class AllOccurence {
	public static void main(String[] args) {
		int []arr={3, 2, 1, 2, 2, 5};
		int target = 2;
		
		allOcc(arr,0,target);
	}
	static void allOcc(int[]arr,int i, int target) {
		if(i == arr.length) return;
		
		if(arr[i] == target)
			System.out.print(i + " ");
		
		allOcc(arr,i+1,target);
	}
}
