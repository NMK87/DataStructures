package org.neha.basic_programs;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(isPrime(30));
    }

//        public static int isPrime(int N) {
//            if (N < 2) return 0;
//            for (int i = 2; i <= Math.sqrt(N); i++) {
//                if (N % i == 0) return 0;
//            }
//            return 1;
//        }
        public static int isPrime(int N){
        if(N==0 || N==1)
            return 0;
        for(int i=2;i<=Math.sqrt(N);i++){
            if(N%i==0){

                return 0;
            }
        }
        return 1;
}
}
