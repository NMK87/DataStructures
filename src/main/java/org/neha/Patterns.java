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
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//        pattern11(5);
//        pattern12(4);
//        pattern13(5);
//        pattern14(5);
//        pattern15(5);
//        pattern16(5);
//        pattern17(5);
//        pattern18(5);
//        pattern19(5);
//        pattern20(5);
//        pattern21(4);
        pattern22(5);
    }

    static void pattern22(int n){
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                int k = Math.min((i), Math.min(((2*n-2)-i), Math.min((j), (2*n-2)-j)));
                System.out.print(n-k + " ");
            }
            System.out.println();
        }
    }

    static void pattern21(int n){
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
               else System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern20(int n){
        int spaces=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            //stars
            for(int j=1; j<=stars;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) spaces-=2;
            else spaces+=2;
        }
    }

    static void pattern19(int n){
        int space=0;
        for(int i=0; i<n; i++){
            //stars
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }
        int spaces=8;
        for(int i=1;i<=n;i++){

            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            spaces-=2;
            System.out.println();
        }
    }

    static void pattern18(int n){
        for(int i=0; i<n; i++){
            for(char ch = (char) ('E' - i); ch<='E'; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int i=0; i<n; i++){

            //spaces
            for(int j=0;j<n-i-1; j++){
                System.out.print(" ");
            }
            //alphabets
            char ch='A';
            int breakpoint= (2*i+1)/2;
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j<= breakpoint) ch++;
                else ch--;
            }
            //spaces
            for(int j=0; j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    static void pattern16(int n){
        for(int i=0; i<n; i++){
            char ch = (char) ('A' + i);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern15(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+(n-i-1);ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void pattern14(int n){

        for(int i=0; i<n;i++){
            for(char ch= 'A'; ch<='A'+i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(num+" ");
                num= num+1;
            }
            System.out.println();
        }
    }


    static void pattern12(int n){
        int space = 2*(n-1);
        for(int i=1; i<=n ; i++){

            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }

            //spaces

            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            //numbers
            for(int j=i; j>=1; j--) {
                System.out.print(j+" ");
            }

            System.out.println();
            space-=2;
        }

    }

    static void pattern11(int n){
        int start;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                start=1;
            }
            else start=0;

            for(int j=1; j<=i; j++){
                System.out.print(start+" ");
                start = 1- start;
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        //as it runs till 9 lines 2*5-1=9
        for(int i=1; i<=2*n-1; i++){
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
   static void pattern9(int n){

        //pattern can be combined
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
