package org.neha;

public class NumberOfDigits {

    public static void main(String[] args) {

//        countDigit(28);
        System.out.println(countDigit(2814098));
    }
    static long countDigit(long x) {
        long sum=0;
        for(int i =0; i<x ;i++){

            sum=x%10;
        }
        return sum;

    }
}
