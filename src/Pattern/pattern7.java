package Pattern;

public class pattern7 {
	public static void main(String[]args){
		int n = 5;
		
		for(int i=0;i<2*n;i++) {
			int stars = i<n ? i+1: 2*n-1-i;
			
			for(int c = 0;c< stars;c++) {
				System.out.print("* ");			
				}
			System.out.println();	
		}
	}
}
