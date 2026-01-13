package Tasks;
// number before a perfect square
public class SunnyNumber {
	public static void main(String[] args) {
		int n = 4;
		if(perfectSquare(n)) {
			System.out.println("Sunny Number");
		}else {
			System.out.println("Not sunny");
		}
	}
	static boolean perfectSquare(int n) {
		for (int i = 1; i<= n; i++) {
			if(i*i == n+1) {
				return true;
			}
        }
		return false;
	}
	

}
