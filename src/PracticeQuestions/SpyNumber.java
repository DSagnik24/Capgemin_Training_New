package PracticeQuestions;

public class SpyNumber {
	public static void main(String[] args) {
		int n = 124;
		System.out.println(spyCheck(n));
	}
	static String spyCheck(int n) {
		int sum=0;
		int prod = 1;
		
		while(n>0) {
			sum +=n%10;
			prod *=n%10;
			n/=10;
		}
		return sum == prod ? "Yes":"No";
	}
}
