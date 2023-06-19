package org.neha;

public class Patterns {

    public static void main(String[] args) {

//        pattern1(5);
//        pattern2(5);
//          pattern3(5);
//          pattern4(5);
//        pattern5(5);
//        pattern6(5);
//        pattern7(5);
        pattern8(5);
    }

    static void pattern8(int n){
        for(int i=0; i<n; i++){

            for(int k=0; k<i ;k++){
                System.out.print(" ");
            }
            for(int j=0; j<2*n-(2*i+1); j++){
                System.out.print("*");
            }
            for(int k=1; k<i ;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    static void pattern7(int n){
        for(int i=0; i<n; i++){

            //spaces
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }

            //stars
            for(int k=0 ; k<2*i+1; k++){
                System.out.print("*");
            }

            //spaces
            for(int l=0; l< n-i-1; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i = 1; i<=n; i++){
            // 1st line->5(n times)
            // 2nd line-> 4
            // 3rd-> 3
            // 4th-> 2
            // 5th-> 1
            // i ->

            for(int j = 0; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

    static void pattern3(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    static void pattern2(int n){
        for(int i = 1; i<=n; i++){
            for(int j =0; j<i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }

    }




    static void pattern1(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
