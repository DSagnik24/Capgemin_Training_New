package Tasks;

public class Main {
	public static void main(String[]args) {
		int num = 10;
		
		int bin = 0;
		int place = 1;
		
		while(num>0) {
			int rem = num%2;
			bin += rem*place;
			place *=10;
			num/=2;
		}
		System.out.println(bin);
	}
}
