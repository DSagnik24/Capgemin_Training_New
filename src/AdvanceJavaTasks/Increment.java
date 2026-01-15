package AdvanceJavaTasks;

import java.util.*;

public class Increment {
	public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
    	int []arr1 = {9,9,9,9,9};
    	int[]arr = plusOne(arr1);
    	
    for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
//        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3,7,2,1})));
//        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9,9,9})));
    }
}
