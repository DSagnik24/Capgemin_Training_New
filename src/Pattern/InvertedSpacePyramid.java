package Pattern;

public class InvertedSpacePyramid {
	public static void main(String[] args) {
		int n = 5;
		invertedPyramid(n);
	}
	static void invertedPyramid(int n) {
		for(int row = 1;row<=n;row++) {
			for(int col = 1;col<=2*n-1;col++) {
				if(row<=col && row+col <= 2*n) {
					System.out.print(" ");
				}else {
					System.out.print("x");
				}
			}
			
			System.out.println();
		}
		
	}
}
