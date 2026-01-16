package User_Input;


public class printSubarray {
	public static void main(String[] args) {

	int[] arr = {1, 2, 3};
	int n = arr.length;

	sumOfsubArrays(arr) ;
	
}
	static void sumOfsubArrays(int[]arr) {
		int n = arr.length;
		int sum = 0;
		
		for (int start = 0; start < n; start++) {
			for (int end = start; end < n; end++) {
				// subarray from index start to end
				for (int k = start; k <= end; k++) {
					sum +=arr[k];
				}
			}
		}
		
		System.out.println(sum);
	}
}


