package Pattern;

public class Pattern3 {
	public static void main(String[] args) {
		for(int row= 0;row<3;row++) {
			for(int col = 0;col<3;col++) {
				if(row >= col) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			}
		}
}
