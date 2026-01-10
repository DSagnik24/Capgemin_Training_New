package Tasks;

public class DisariumNumber {
	public static void main(String []args) {
		int num = 136;
		int temp = num;
		int len =0;
		
		while(temp >0) {
			len++;
			temp /= 10;
		}
		
		temp = num;
		int sum = 0;
		int pos = len;
		
		while(temp > 0) {
			int d = temp%10;
			int power = 1;
			
			for(int i=0;i<pos;i++) {
				power *=d;
			}
			
			sum += power;
			pos--;
			temp /=10;
		}
		 if (sum == num)
	            System.out.println("Disarium Number");
	        else
	            System.out.println("Not a Disarium Number");
	}
}
