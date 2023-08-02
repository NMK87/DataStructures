package org.neha.basic_programs;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {1,1,2,2,3,3,4,4,4},9));
    }
    public static int removeDuplicates(int A[],int N){

        int i=0;
        for(int j=1; j<N;j++){
            if(A[i]!=A[j]){
                A[i+1]=A[j];
                i++;
            }
        }
        return i+1;
    }
}
