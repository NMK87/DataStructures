package org.neha.basic_programs;

import java.util.Arrays;

public class PushZeroToEnd {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(pushZerosToEnd(new int[] {0,1,0,5,0,2},6)));
    }

    static int[] pushZerosToEnd(int[] arr, int n) {
        int add=0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[add++] = arr[i];
        while (add < n)
            arr[add++] = 0;

        return arr;
    }
}
