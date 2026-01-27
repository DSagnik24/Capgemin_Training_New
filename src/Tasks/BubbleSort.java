package Tasks;

public class BubbleSort {
	public static void main(String[] args) {
		int[]arr = {1,222,3,34,55,67,07};
		bubbleSort(arr);
		
		for(int n:arr) {
			System.out.print(n + " ");
		}
	}
	static void bubbleSort(int[]arr) {
		boolean swapped;
		for (int i = 0; i < arr.length-1; i++) {
			swapped = false;
			for (int j = 0; j < arr.length-1  ; j++) {
				if(arr[j]>arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					
					swapped = true;
				}
			}
		}
	}
}
