package AdvanceJavaTasks;

public class IdentityMatrix {

    public static boolean isIdentity(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matrix[i][j] != 1)
                    return false;
                if (i != j && matrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };

        System.out.println(isIdentity(mat));
    }
}
