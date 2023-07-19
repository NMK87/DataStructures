package org.neha.basic_programs;

import java.util.Scanner;

public class AmstrongNumber {

    static boolean armstrongNumber(int n){
        int count=0, rem=0, sum = 0;

        int temp=n;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        temp=n;
        while(temp>0){
            rem= temp%10;
            sum+= Math.pow(rem,count);
            temp=temp/10;
        }
        if(n==sum){
            return true;
        }
        else return false;

    }

    public static void main(String[] args) {

        System.out.println("Number: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();


        if(armstrongNumber(num)){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
}
