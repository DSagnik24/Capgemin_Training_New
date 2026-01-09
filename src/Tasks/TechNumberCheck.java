package Tasks;

//2025 → 20 + 25 = 45
//45² = 2025

public class TechNumberCheck {
	public static void main(String[]args) {
		int num = 2025;
		int newNume = num;
		int sum = 0;
		while(num > 0) {
			sum+= num%100;
			num /= 100;
		}
		
		int sq = sum * sum;
		
		if(sq == newNume) {
			System.out.println("Tech number");
		}else {
			System.out.println("Not Tech number");
		}
	}
}
