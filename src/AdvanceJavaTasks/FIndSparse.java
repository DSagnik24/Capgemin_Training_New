package AdvanceJavaTasks;

import java.util.Iterator;

public class FIndSparse {
	public static void main(String[] args) {
		  int[][] arr = {
		            {3, 0, 3},
		            {0, 2, 5},
		            {1, 0, 4}
		        };
		System.out.println(findSparse(arr));
	}
	static String findSparse(int[][]arr) {
		int zeroes=0;
		int nonZeroes = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] == 0) {
					zeroes++;
				}else {
					nonZeroes++;
				}
			}
		}
		return zeroes>nonZeroes ? "Sparse":"Not Sparse";
	}
}
