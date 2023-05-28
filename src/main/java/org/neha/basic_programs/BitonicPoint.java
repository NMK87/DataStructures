package org.neha.basic_programs;

public class BitonicPoint {
    public static void main(String[] args) {
        int maxElement = findMaximum(new int[]{1,2,3,4,5,6},6);
        System.out.println(maxElement);
    }

    static int findMaximum(int arr[], int n){
        int max=arr[0];
        int result = 0;
        for(int i =0;i<n;i++){
            
            result=Math.max(max,arr[i]);
            
        }
        return result;
        
    }
}
