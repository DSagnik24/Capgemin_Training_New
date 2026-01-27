package Tasks;

public class FIndRepeated {
	public static void main(String[] args) {
		int[]nums = {1,2,3,2,1};
		int[] res = findRepeated(nums);
		
		for(int x:res) {
			if(x!=0) {
				System.out.println(x+" ");
			}
		}
	}
	static int[] findRepeated(int[]arr){
		int l=0;
		int []res = new int[arr.length];
		int k =0;
		
		while(l<arr.length) {
			for(int r=l+1;r<arr.length;r++) {
				if(arr[l] == arr[r]) {
					res[k++] = arr[r];
					break;
				}
			}
			l++;
		}
		return res;
	}
}
