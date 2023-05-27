package org.neha;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        int n=5;

        int[] arr = {70,80,90,50,40};

        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<n;i++){

//            max = Math.max(max,arr[i]);
//            min = Math.min(min,arr[i]);

            if(max<arr[i]){
                max = arr[i];
            }

            if(min>arr[i]){
                min = arr[i];
            }

        }

        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+min);

    }
}
