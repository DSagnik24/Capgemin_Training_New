package Pattern;

public class CustomStarPattern {
    public static void main(String[] args) {
        int n = 4;

        // Upper half (including middle)
        for (int i = 0; i < n; i++) {

            // Left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            int spaces = (n - i) * 4 - 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 2; i >= 0; i--) {

            // Left stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            // Middle spaces
            int spaces = (n - i) * 4 - 2;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Last single star
        for (int i = 0; i < n * 3; i++) {
            System.out.print(" ");
        }
        
    }
}

