package Tasks;

public class AverageOfArray {
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7};
		System.out.println(findAvg(arr));
	}
	
	static double findAvg(int[]arr) {
		int sum = 0;
		int len = arr.length;
		
		for(int i=0;i<len;i++) {
			sum+=arr[i];
		}
		
		return (double)sum/len;
	}
}
