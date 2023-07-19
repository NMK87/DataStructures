package org.neha.basic_programs;

public class Pallindrome {

    public static void main(String[] args) {
        pallindromeOfNumber(12178);
    }
    static void pallindromeOfNumber(int x){

        int rem=0, rev=0;
        int temp=x;
        while(x>0){

            rem = x%10;
            rev  = (rev*10)+rem;
            x=x/10;
        }
        if(rev==temp){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not pallindrome");
        }

    }
}
