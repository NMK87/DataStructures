package org.neha.basic_programs;

public class ExPatters {

    public static void main(String[] args) {

//        p1(5);
//        p2(5);
//        p3(5);
//        p4(5);
//        p5(5);
////        p6(5);
//        p7(5);
//        p8(5);
//        p10(5);
//        pi10(5);
        p11(5);
    }


//    static void p1(int n){
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    static void p2(int n){
//        for(int i=0; i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//
//    static void p3(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }

//    static void p4(int n){
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }
//    }

//    static void p5(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }

//    static void p6(int n){
//        for(int i=0;i<n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }

    static void p7(int n){
        for(int i=0;i<n;i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                System.out.print("*");
            }
            for(int l=0; l<n-i-1; l++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void p8(int n){
        for(int i=0; i<n;i++){
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*n-(2*i+1); k++){
                System.out.print("*");
            }
            for(int l=0; l<i; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void p10(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=0; j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p11(int n){
        int start;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                start=1;
            }
            else start=0;
            for(int j=1; j<=i; j++){
                System.out.print(start +" ");
                start = 1- start;
            }
            System.out.println();
        }
    }

}
