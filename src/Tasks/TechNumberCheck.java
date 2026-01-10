package Tasks;

//2025 → 20 + 25 = 45
//45² = 2025

public class TechNumberCheck {
	public static void main(String[]args) {
		int num = 494209;
		int newNume = num;
		
		int length = countLength(num);
		
		int l = length/2;
		
		int power = 1;
		for(int i=0;i<l;i++) {
			power*=10;
		}
		int res = 0;
		while(num>0) {
			res += num%power;
			num/=power;
		}
		int sq = res*res;
		
		if(sq == newNume) {
			System.out.println("Tech number");
		}else {
			System.out.println("Not Tech number");
		}
	}
	
	static int countLength(int num) {
		int count = 0;
		while(num!=0) {
			num/=10;
			count ++;
		}
		return count;
	}
}
