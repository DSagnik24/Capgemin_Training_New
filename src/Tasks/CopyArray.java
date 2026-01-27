package Tasks;

public class CopyArray {
	public static void main(String[] args) {
		int[]arr= {1,2,3};
		int []arr1= copyArray(arr);
		
		for (int i : arr1) {
			System.out.println(i);
		}
	}
	static int[]copyArray(int[]arr){
		int[]res=new int[arr.length];
		
		for (int i = 0; i < res.length; i++) {
			res[i] = arr[i];
		}
		
		return res;
	}
}
