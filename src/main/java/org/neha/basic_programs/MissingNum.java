package org.neha.basic_programs;

public class MissingNum {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {1,2,3,4,5},6));
    }
    public static int missingNumber(int A[], int N)
    {

       int sum=0, adding=0, remaining=0;
       sum=N*(N+1)/2;

       for(int i=0; i<A.length;i++){
           adding=adding+A[i];
       }
        remaining=sum-adding;
        return remaining;
    }


}
