package Recursion;

public class ReverseWithRecursion {
	public static void main(String[]args) {
		int n = 12456;
		System.out.print(reverse(n,0));
	}
	
	static int reverse(int n,int rev) {
		if(n==0) return rev;
		return reverse(n/10,rev*10+n%10);
	}
}

