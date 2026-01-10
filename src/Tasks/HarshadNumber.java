package Tasks;

//Number = 18
//Sum of digits = 1 + 8 = 9
//18 % 9 = 0

public class HarshadNumber {
	public static void main(String []args) {
		int num = 19;
		int temp = num;
		int sum =0;
		
		while(num!=0){
			sum += num%10;
			num /=10;
		}
		
		if(temp%sum == 0) {
			System.out.println("Harshad number");
		}else {
			System.out.println("Not Harshad number");
		}	}
}
