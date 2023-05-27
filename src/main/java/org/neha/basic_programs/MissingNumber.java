package org.neha.basic_programs;

public class MissingNumber {

    public static void main(String[] args) {

        int N=5, sum=0,addingNumbers=0,numberMissedIs=0;
        int[] arr = {1,2,3,5};
        sum = (N*(N+1))/2;

        for(int i=0;i<N-1;i++){

            addingNumbers= addingNumbers+arr[i];

        }
        numberMissedIs=sum-addingNumbers;
        System.out.println(numberMissedIs);

    }
}
