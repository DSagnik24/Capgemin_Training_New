package Tasks;

public class ArmStrongNumberCheck {
	public static void main(String[]args) {
		int num = 153;
		
		int count = countLength(num);
		 
		int temp = num;
		int sum = 0;
		while(temp>0) {
			int d = temp%10;
			sum += Power(d,count);
			temp /=10;
		}
		 if (sum == num)
	            System.out.println("Armstrong Number");
	        else
	            System.out.println("Not an Armstrong Number");
		
		
	}
	static int countLength(int num) {
		int count = 0;
		while(num!=0) {
			num/=10;
			count ++;
		}
		return count;
	}
	
	static int Power(int d, int count) {
		int res = 1;
		for(int i=0;i<count;i++) {
			res *= d;
		}
		return res;
	}
}
