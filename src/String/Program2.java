package String;

public class Program2 {
	public static void main(String[] args) {
//		//to check if the 1st is digit and then 9 = length
//		System.out.println("834565858".matches("[6-9]\\d{9,12}"));
//		System.out.println("834565858385345".matches("[6-9]\\d+"));
//		System.out.println("634565858543862".matches("[6-9]\\d{9,}"));
//		System.out.println("834565858237357".matches("[6-9]\\d{9}"));
//		boolean a = ("aa".matches("[A-Z]?"));
//		System.out.println(a);
		
		String s = "helloABWX";
		String s2 = "#$";
		System.out.println(s.matches("\\w+"));
		System.out.println(s2.matches("\\w+"));
		String s1 = " ";
		System.out.println(s1.matches("\\s+"));
	}
}
