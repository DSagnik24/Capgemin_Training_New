package Tasks;

//Number = 1023 Contains zero and does not start with zero

public class DuckNumber {
	public static void main(String[]args) {
		int num = 1023;
		int temp = num;
		
		boolean flag = false;
		
		while(temp>0) {
			if(temp %10 == 0) {
				flag = true;
				break;
			}
			temp /=10;
		}
		if (flag)
            System.out.println("Duck Number");
        else
            System.out.println("Not a Duck Number");
		
	}
}
