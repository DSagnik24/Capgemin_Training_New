package Pattern;

public class Pattern8 {
	public static void main(String[]args) {
	int n = 5;
		
		for(int i=0;i<2*n;i++) {
			int stars = i>n ? 2*n-i:i;
			int spaces = n-stars;
			
			for(int s = 0;s<spaces;s++) {
				System.out.print(" ");
			}
			
			for(int c = 0;c< stars;c++) {
				System.out.print("* ");			
				}
			System.out.println();	
		}
	}
}
