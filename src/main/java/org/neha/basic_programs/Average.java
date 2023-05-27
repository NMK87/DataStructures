package org.neha.basic_programs;

public class Average {

    public static int avg(int numbers[], int n){
        int sum = 0;
        for(int i = 0; i < n; i++ ){
            sum = sum + numbers[i];
        }
        int result = sum/n;
        return result;
    }

}
