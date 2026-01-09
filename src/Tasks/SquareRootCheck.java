package Tasks;

public class SquareRootCheck {
	public static void main(String[]args) {
		int num = 91;
		int root = -1;
		
		for(int i=0;i*i<=num;i++) {
			if(i*i == num) {
				root = i;
				break;
			}
		}
		if (root != -1)
            System.out.println("Square root exists: " + root);
        else
            System.out.println("Square root does not exist");
		
	}
}
