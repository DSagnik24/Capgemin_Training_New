package User_Input;


public class printSubarray {
	public static void main(String[] args) {

	int[] arr = {1, 2, 3, 4};
	int n = arr.length;

	for (int start = 0; start < n; start++) {
		for (int end = start; end < n; end++) {
			// subarray from index start to end
			for (int k = start; k <= end; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
	}
}
}


