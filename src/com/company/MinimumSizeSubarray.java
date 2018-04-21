package com.company;

public class MinimumSizeSubarray {

    public static void main(String args[]) {
        int[] nums = { 2,3,1,2,4,3 };
        System.out.println(minSubArrayLen(7, nums ));
    }

    public static int minSubArrayLen(int s, int[] nums) {

        int minSize = Integer.MAX_VALUE , sum = 0 ;
        int start = 0 , end = 0 ;
        while (end <= nums.length ){
            if( sum <= s && end< nums.length ) {
                sum += nums[end];
                end++;
            }
            else {
                sum -= nums[start];
                start++;
            }

            if(sum == s)
            {
                if( end - start < minSize){
                    minSize = end - start;
                }
            }
        }

        return minSize;

    }
}
