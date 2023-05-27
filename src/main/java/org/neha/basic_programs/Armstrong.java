package org.neha.basic_programs;

public class Armstrong {

    public static boolean armstrong(int n){
        int count = 0;
        int number = n;
        while (number != 0) {
            number=number/10;
            count++;
        }
        int sum = 0;
         number=n;
        for(int i = 0; i < count; i++){
            int last=number%10;
            sum = sum + (int) (Math.pow(last,count));
            number = number/10;
        }
        if (sum == n){
            return true;
        }
        else{
            return false;
        }
    }
}
