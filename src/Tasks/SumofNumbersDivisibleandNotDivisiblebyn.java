package Tasks;

public class SumofNumbersDivisibleandNotDivisiblebyn {
	public static void main(String[]args) {
		int n =4,m=20;
		int sumOfD =0;
		int sumOfND =0;
		for(int i=0;i<=m;i++) {
			if(i%n == 0) {
				sumOfD += i;
			}else {
				sumOfND += i;
			}
		}
		System.out.println(sumOfND - sumOfD);
	}
}
