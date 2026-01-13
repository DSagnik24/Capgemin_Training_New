package Pattern;

public class NormalSpacePyramid {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {

            // Left stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int j = 0; j <2 * i; j++) {
                System.out.print("  ");
            }

            // Right stars (skip for last row to avoid duplication)
            if (i != n - 1 || i >= n - 1) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}
