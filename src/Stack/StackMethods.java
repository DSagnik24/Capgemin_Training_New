package Stack;

import java.util.*;

public class StackMethods {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		
		System.out.println(st);
		
		st.push(100);
		st.push(200);
		st.push(300);
		System.out.println("after Push: "+st);
		
		st.pop();
		System.out.println("after Pop: "+st);
		
		System.out.println("Peek: "+st.peek());
		System.out.println("after Peek: "+st);
		
		System.out.println("empty: "+st.empty());
		System.out.println("search: "+st.search(300));
	}

}
