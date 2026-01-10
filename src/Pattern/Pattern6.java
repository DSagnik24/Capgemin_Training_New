package Pattern;

public class Pattern6 {
	public static void main(String[] args) {
		int  n =3;
		
		for(int row= 1;row<=n;row++) {
			for(int col = n-1;col>=row;col--) {
				System.out.print(" ");			
				}
		for(int c = 1;c<=2*row-1;c++) {
			System.out.print("*");			
	}
		System.out.println();
		
		}
	
}

}
