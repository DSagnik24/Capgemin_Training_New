package AdvanceJavaTasks;

import java.util.*;

public class InterchangeDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][n - i - 1];
            matrix[i][n - i - 1] = temp;
        }

        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

