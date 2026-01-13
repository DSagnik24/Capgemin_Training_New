package Recursion;

public class FirstOccurence {
	public static void main(String[] args) {
		int []arr = {2,4,6,4,8};
		int target = 4;
		System.out.println(find(arr,0,target));
	}
	static int find(int[]arr,int index,int target) {
		if(index == arr.length) return -1;
		if(arr[index] == target)return index;
		return find(arr,index+1,target);
	}
}
