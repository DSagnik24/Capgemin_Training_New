package Tasks;
import java.util.*;

public class CharArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter characters: ");
        char[] arr = sc.next().toCharArray();

        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
	}
}
