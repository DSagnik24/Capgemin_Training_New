package FlowControl;

public class DoWhile {
	public static void main(String[]args) {
		int num = 7;
		
		int sum =0;
		int a = 1;
		
		while(a <num) {
			if(num %a == 0) sum+= a;
			a++;
		}
		if(num ==sum) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not Perfect Number");
		}
	}

}
