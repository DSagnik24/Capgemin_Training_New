package FlowControl;

public class SpyNumber {
	public static void main(String[]args) {
		int num = 123;
		int sum = 0;
		int prod = 1;
		
		while(num!=0) {
			sum = sum + num%10;
			prod = prod * num%10;
			num = num/10;
		}
		
		
		if(sum == prod) {
			System.out.println("Spy number");
		}else {
			System.out.println("Not Spy number");
		}
	}

}
