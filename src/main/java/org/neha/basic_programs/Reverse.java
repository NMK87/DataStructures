package org.neha.basic_programs;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse(1245));
    }
    static int reverse(int x){

        int rem=0, rev=0;
        while(x!=0){
            rem = x%10;
            rev  =(rev*10)+rem;
            x=x/10;
        }
        return rev;
    }
}
