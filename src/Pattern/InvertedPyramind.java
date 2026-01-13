package Pattern;

public class InvertedPyramind {
	public static void main(String[] args) {
		int n = 5;
		invertedPyramid(n);
	}
	static void invertedPyramid(int n) {
		for(int row = 1;row<=n;row++) {
			for(int col = 1;col<=2*n-1;col++) {
				if(row<=col && row+col <= 2*n) {
					System.out.print("x");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
		
	}
}
