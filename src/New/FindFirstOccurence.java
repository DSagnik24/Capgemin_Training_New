package New;

public class FindFirstOccurence {
	public static void main(String[]args) {
		int[] arr = {2,4,4,4,7,9,11};
		int target = 4;
		System.out.println(findOccurence(arr,target));
		System.out.println(lastOccurence(arr,target));
	}
	
	static int findOccurence(int[]arr,int target) {
		 int l = 0;
	     int r = arr.length - 1;
	     int ans = -1;
	     
	        while (l <= r) {
	            int mid = (l + r) / 2;
	           
	            if (arr[mid] == target) {
	            	ans = mid;
	            	r = mid-1;
	            } else if (arr[mid] < target) {
	                l = mid + 1;
	            } else {
	                r = mid - 1;
	            }
	        }
	        return ans;
	}
	static int lastOccurence(int[]arr,int target) {
		int l = 0;
	     int r = arr.length - 1;
	     int ans = -1;
	     
	        while (l <= r) {
	            int mid = (l + r) / 2;
	           
	            if (arr[mid] == target) {
	            	ans = mid;
	            	l = mid+1;
	            } else if (arr[mid] < target) {
	                l = mid + 1;
	            } else {
	                r = mid - 1;
	            }
	        }
	        return ans;
	}
}
