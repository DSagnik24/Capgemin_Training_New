package String;

import java.util.Iterator;

public class Program1 {
	public static void main(String[] args) {
		String s = "hello";
		
		System.out.println(s.length());
		
		char[]ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		
		byte[]b = s.getBytes();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		
		System.out.println(s.startsWith("Ha"));
		System.out.println(s.endsWith("o"));
		
		
		String res = s.replaceAll("l", "k");
		System.out.println(res);
		
		System.out.println(s.contains("k"));
		
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("k"));
		
		String s1 = "Java is a language";
		String[]res1 = s1.split(" ");
		
		for (int i = 0; i < res1.length; i++) {
			System.out.print(res1[i]);
		}
		System.out.println();
	}
}
