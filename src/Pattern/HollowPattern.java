package Pattern;

public class HollowPattern {
	public static void main(String[] args) {
		printPattern(5);
	}

	 static void printPattern(int n) {
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {

	                if (
	                        i == 0 || i == n - 1 ||                 // top & bottom
	                        (i != n / 2 && j < 2) ||                // left side
	                        (i != n / 2 && j >= n - 2) ||           // right side
	                        (i == n / 2 && j == n / 2)              // center star
	                ) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
}
