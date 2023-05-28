package org.neha.basic_programs;

import java.util.Arrays;

public class TransposeOfMatrix {

    public static void main(String[] args) {

        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        transpose(arr,3);
        System.out.println(Arrays.deepToString(arr));

    }
    static void transpose(int matrix[][], int n)
    {
             for(int i = 0;i<n;i++){
            for(int j=i;j<n;j++){

                int temp = 0;
                temp=matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
    }
}
}
