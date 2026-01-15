package String.StringBuilder;

public class Program2 {
	public static void main(String[] args) {
		//StringBuilder sb = new StringBuilder();
		StringBuffer sb = new StringBuffer();
		sb.append("abcd");
		
		System.out.println(sb.reverse());
		sb.append("1234Hello");
		
		System.out.println(sb);
		sb.delete(3,6 );
		System.out.println(sb);
		sb.insert(2,"student");
		System.out.println(sb);
	}
}
