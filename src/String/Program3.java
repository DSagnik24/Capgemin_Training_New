package String;

public class Program3 {
	public static void main(String[] args) {
		String s = "java!w#qse(";
		
		String s1[] = s.split("[!#(]");
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
		
		String s2 = "@!#$%^&";
		System.out.println(s2.matches("[^a-zA-Z0-9]+"));
		
	}
}
