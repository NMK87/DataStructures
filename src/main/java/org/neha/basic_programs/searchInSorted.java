package org.neha.basic_programs;

public class searchInSorted {

    public static void main(String[] args) {
        System.out.println(searchInSorted(new int[] {1,2,3,4,5},5,2));
    }
    static int searchInSorted(int arr[], int N, int K)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==K){
               return 1;
            }
        }
        return -1;
    }

}
