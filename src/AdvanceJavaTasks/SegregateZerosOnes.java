package AdvanceJavaTasks;

import java.util.*;

public class SegregateZerosOnes {

    public static void segregate(int[] arr) {
        int countOnes = 0;

        for (int num : arr) {
            if (num == 1) countOnes++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < countOnes)
                arr[i] = 1;
            else
                arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,0,1,1,0,1};
        segregate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
