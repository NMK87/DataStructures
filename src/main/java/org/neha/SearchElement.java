package org.neha;

public class SearchElement {
    public static void main(String[] args) {

        int number = missingNumber(new int[]{10,20,30,40,50},5,30);
        System.out.println(number);
    }

    static int missingNumber(int arr[],int N,int X){

        for(int i=0;i<N;i++){

            if(arr[i]==X)
            return i;
        }
            return -1;
    }
}