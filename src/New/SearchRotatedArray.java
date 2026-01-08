package New;

public class SearchRotatedArray {
	public static void main(String[]args) {
		int[] arr = {9,11,2,4,7};
		int target = 4;
		
		System.out.print(searchRotated(arr,target));
		
	}
	static boolean searchRotated(int[]arr,int target) {
		int l=0,r = arr.length-1;
		
		while(l<=r) {
			int mid = (l+r)/2;
			
			if(arr[mid] == target) 
				return true;
				
			if(arr[l] < arr[mid]) {
				if(target > arr[l]  && target < arr[mid]) {
					r = mid-1;
					
				}else {
					l = mid +1;
				}
			}
			else {
				if( target > arr[mid] && target <= arr[r]) {
					l = mid + 1;
				}else {
					 r = mid - 1;
				}
			}
		}
		return false;
	}
}
