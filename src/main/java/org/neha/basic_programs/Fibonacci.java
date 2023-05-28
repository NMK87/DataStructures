package org.neha.basic_programs;

public class Fibonacci {

    public static void main(String[] args) {
        long[] result= printFibb(10);
        System.out.println(result);
    }
    public static long[] printFibb(int n)
    {

        int a=0,b=1;
               long sum;

        for(int i =0; i<n-2;i++){
            sum = a+b;
            System.out.println(sum);
            a=b;
            b=sum;
        }
        return sum;
    }
}
