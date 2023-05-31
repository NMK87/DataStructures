package org.neha.basic_programs;

public class Fibonacci {

    public static void main(String[] args) {

        int n=10;
        int a=1;
        int b=1;

        int sum=0;
        if(n==1){
            System.out.println(a);
            return;
        }
        System.out.print(a+" "+b);

        for(int i=0; i<n-2;i++){

            sum=a+b;
            System.out.print(" "+sum);
            a=b;
            b=sum;
        }

    }

}
