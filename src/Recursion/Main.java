package Recursion;

public class Main {
	public static void main(String[]args) {
		int n=5;
		print(n);
	}
	
	static void print(int n) {
		while(n>0) {
			System.out.println(n--);
		}
		
	}
	
	
	/*
	1.Break the problem into smaller problems
	2.Write recurrence relations
	3.Draw recursive tree
	4.Identify the flow of the tree
	5.Left tree is completed then the right tree
	*/
	
}
