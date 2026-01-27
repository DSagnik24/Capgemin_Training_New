package Tasks;

public class CheckPlaindrome {
	public static void main(String[] args) {
		char[]arr = {'s','a','a','a','s'};
		System.out.println(checkIt(arr));
		
	}
	static boolean checkIt(char[]arr) {
		int l=0,r=arr.length-1;
		
		while(l<r) {
			if(arr[l] != arr[r]) {
				return false;
			}
				l++;
				r--;
			
		}
		return true;
		
	}
}
