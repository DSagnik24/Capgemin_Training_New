package PracticeQuestions;

public class RepeatedString {
	public static void main(String[] args) {
		String s = "aba";
		int n = 10;
		char ch = 'a';
		
		find(s,n,ch);
	}
	static void find(String s,int n,char ch) {
		int mul = n/s.length();
		int rem = n%s.length();
		int countCh = 0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ch)countCh++;
		}
		int res = countCh*mul;
		
		int remCount =0;
		for(int i=0;i<rem;i++) {
			if(s.charAt(i) == ch)remCount++;
		}
		res += remCount;
		
		
		System.out.println(res);
	}
}
