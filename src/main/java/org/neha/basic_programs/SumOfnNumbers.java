package org.neha.basic_programs;

public class SumOfnNumbers {

    public static int sum(int numbers[]){
        int n=0;
        for(int i=0; i< numbers.length ; i++){
            n= n + numbers[i];
        }
        return n;
    }
}
