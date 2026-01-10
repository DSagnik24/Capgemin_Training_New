package Tasks;
//Number = 145
//Calculation = 1! + 4! + 5! = 1 + 24 + 120 = 145

public class StrongNumberCheck {
	public static void main(String[]args) {
		int num = 146;
		int temp = num;
		int sum =0;
		
		while(num != 0) {
			sum += factorial(num%10);
			num/=10;
		}
		
		if(sum == temp) {
			System.out.println("Strong number");
		}else {
			System.out.println("Not Strong number");
		}
	}
	
	static int factorial(int n) {
		int res = 1;
		while(n!=0) {
			res *= n;
			n--;
		}
		return res;
	}
}
