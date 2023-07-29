package org.neha.basic_programs;

import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        System.out.println(print2largest(new int[] {10,7,3,4,2},5));
    }
   static int print2largest(int arr[], int n) {
       Arrays.sort(arr);

       int max=arr[n-1];

       for(int i=n-2; i>=0; i--){
           if(arr[i]!= max)
               return arr[i];
       }
       return -1;

   }

//    public static int print2largest(int arr[], int n) {
//        Arrays.sort(arr);
//        int max = arr[n-1];
//        for (int i = n-2; i >= 0; i--) {
//            if (arr[i] != max) return arr[i];
//        }
//        return -1;
//    }
}
