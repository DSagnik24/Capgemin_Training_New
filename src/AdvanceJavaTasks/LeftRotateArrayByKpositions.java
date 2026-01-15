package AdvanceJavaTasks;

import java.util.*;

public class LeftRotateArrayByKpositions {
	public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        rotateLeft(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
