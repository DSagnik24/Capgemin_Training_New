package FlowControl;

public class Main {
	public static void main(String[]args) {
		
//		int num  = 1863;
//		
//		int rev = 0;
//		
//		while(num!=0) {
//			rev = num%10 + rev*10;
//			num = num/10;
//		}
//		System.out.println(rev);
		
		int num = 10;
		int rev = 0;
		while(num>0) {
		rev = num%2 + rev*10;
			num = num/2;
		}
		System.out.println(rev);
		
	}
	
//	static void convertToBinary(int num) {
//		int ans = 0;
//		while(num!=0) {
//			int rem = num%2;
//			ans = rem*10;
//			num/=10;
//		}
//		System.out.println(ans);
//		
//	}
}
