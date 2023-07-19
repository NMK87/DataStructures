package org.neha.basic_programs;

public class FindFactors {

    public static void main(String[] args) {
        System.out.println(find(5));

    }
    public static int find(int n){
int count=0;
    for(int i=1; i<=n; i++) {

        if (n % i == 0) {

            if(n/i==i){
                count++;
            }
            else{
                count++;
            }
        }
    }

        return count;
    }
}
