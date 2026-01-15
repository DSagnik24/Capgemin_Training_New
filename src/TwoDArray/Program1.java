package TwoDArray;

public class Program1 {
	public static void main(String[] args) {
		int[][]a = {{100,20},{40,21}};
		
		int[][] c = new int[2][2];
		
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				System.out.println(a[i][j]);
//			}
//		}
	}
}
