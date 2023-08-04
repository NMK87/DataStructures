package org.neha.basic_programs;

public class ConcecutiveNumber {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,2,3,4,4,4}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {

        int count=0; int max=0;
        for(int i=0; i<nums.length;i++){

            if(nums[i]==1){
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;

            }
            max=Math.max(max,count);

        }
        return max;
    }
}
