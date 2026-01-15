package Arrays;

public class NewProg {
	
	public static void main(String[] args) {
		int a[] = {10,20,30};
		int []res = demo(a);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
	static int[] demo(int[]a) {
		int[]b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i]*3;
		}
		return b;
	}
}
