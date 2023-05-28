package org.neha.basic_programs;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        convertToWave(5,arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void convertToWave(int n, int[] a) {

        int temp;
        for(int i=0;i<n-1;i=i+2){
            temp = a[i+1];
            a[i+1]=a[i];
            a[i]=temp;

            }

        }
    }

