package Tasks;

public class AutoMorphicNumber {
	
	
	// 5^2 == 25%10 = 5 == 5
	// 7^2 == 49%10 = 9 != 7
	public static void main(String[]args) {
		
		int num = 7;
		
		if(checkAutomorphic(num)) {
			System.out.print("Automorphic");
		}else {
			System.out.print("Not Automorphic");
		}
		
	}
	static boolean checkAutomorphic(int num) {
		int sq = num*num;
		
		while(num > 0) {
			if(num%10 != sq%10 ) {
				return false;
			}
			num /= 10;
			sq /=10;
		}
		return true;
		
	}

}
