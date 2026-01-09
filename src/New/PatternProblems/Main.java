package New.PatternProblems;

public class Main {
	public static void main(String[]args) {
		pattern1(4);
		System.out.println();
		pattern2(4);
		System.out.println();
		pattern3(4);
		System.out.println();
		pattern4(5);
	}
	
	static void pattern1(int n) {
		for(int row = 0;row<=n;row++) {
			for(int col = 0;col<=n;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern2(int n) {
		for(int i=1;i<=n;i++) {
			 for(int col = 1;col<=i;col++) {
				 System.out.print("* ");
			 }
			 System.out.println();
		}
	}
	
	static void pattern3(int n) {
		for(int row =n; row>= 1;row--) {
			for(int col = row;col>=1;col--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pattern4(int n) {
		for(int row =1; row<= n;row++) {
			for(int col = 1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
