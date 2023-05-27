package org.neha.basic_programs;

public class Factorial {

    public static int fact(int n){
        int sum=1;
        for(int i = 1; i <= n; i++) {
            sum = sum*i;
        }
        return sum;
    }

}
