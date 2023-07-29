package org.neha.basic_programs;

public class LargestNumber {

    public static void main(String[] args) {
        System.out.println(largest(new int[]{10,70,40,20,90},5));
    }
    public static int largest(int arr[], int n)
    {
       int max=arr[0];

       for(int i=0;i<arr.length;i++){
//           if(max<arr[i])
//               max=arr[i];
           max=Math.max(max,arr[i]);
       }
       return max;
    }


}
