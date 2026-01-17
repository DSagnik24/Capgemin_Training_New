package PracticeQuestions;

public class ConvertIntegerToBinary {
	public static void main(String[] args) {
		int n = 10;
		System.out.println(conversion(n));
	}
	static int conversion(int n) {
		int res = 0;
		int places = 1;
		
		while(n >0) {
			int rem = n%2;
			res = res + rem*places;
			places*=10;
			n /=2;
		}
		return res;
	}
}
