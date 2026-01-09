package FlowControl;

public class NeonNumberCheck {
	// 9^2 = 81  ==> 8+1 == 9
	
	public static void main(String[]args) {
		int num = 9;
		
		int sq= num*num;
		int sq1 = sq;
		int sum = 0;
		while(sq != 0) {
			sum = sum +sq%10;
			sq = sq/10;
		}
		
		if(sq1 == num) {
			System.out.print("Neon Number");
		}else {
			System.out.print("Neon Number");
		}
		
	}
	

}
