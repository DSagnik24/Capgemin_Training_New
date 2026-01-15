package TwoDArray;


public class Program2 {
	public static void main(String[] args) {
		int[][]a = {{100,20},{40,21}};
		int[][]b = {{200,25},{46,91}};
		
		int[][]res = sum(a,b);
		printArr(res);
		
	}
	static void printArr(int[][]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	static int[][] sum(int[][]a,int[][]b){
		int row = a.length;
		int col = a[0].length;
		int[][] res = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				res[i][j] = a[i][j] + b[i][j];
			}
		}
		return res;
	}
}
