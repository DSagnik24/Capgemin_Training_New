package Tasks;
//number whose binary has even number of 1's
public class EvilNumberCheck {
	public static void main(String[]args) {
		int num = 8;
		
		int bin = 0;
		int place = 10;
		
		while(num >0) {
			int rem = num%2;
			bin += rem*place;
			place*=10;
			num/=2;
		}
		int countOfOnes = 0;
		while(bin>0) {
			if(bin%10 == 1) countOfOnes++;
			bin /=10;
		}
		
		if(countOfOnes%2 == 0) {
			System.out.println("Evil Number");
		}else {
			System.out.println("Not Evil Number");
		}
	}

}
