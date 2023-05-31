package org.neha.basic_programs;

import java.util.Arrays;

public class InsertionSort {
    private static int temp;

    public static void main(String[] args) {

        int arr[] = {10,80,50,30};
        insertionSort(arr, 4);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int arr[], int n)
    {
        for (int i = 1; i < n; i++) {
            int unsorted = i;

            for (int j = i-1; j >= 0; j--) {

                if (arr[unsorted] < arr[j]) {
                    int temp = arr[unsorted];
                    arr[unsorted] = arr[j];
                    arr[j] = temp;
                    unsorted--;
                }
            }
        }
    }

    }

