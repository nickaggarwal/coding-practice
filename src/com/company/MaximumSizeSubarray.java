package com.company;

import java.util.HashMap;
import java.util.Map;

public class MaximumSizeSubarray {

    public static void main(String args[]) {
        int[] nums = { -2, -1, 2, 1 };
        System.out.println(minSubArrayLen(1, nums ));
    }

    public static int minSubArrayLen(int s, int[] nums) {

        int size = nums.length, presum = 0, maxSize = 0  ;
        Map<Integer, Integer> hash = new HashMap<>();
        hash.put(0, -1);
        for(int i=0; i < size ; i++){
            presum += nums[i] ;
            if(! hash.containsKey(presum)) {
                hash.put(presum, i);
            }

            if( hash.containsKey(presum - s)) {
                int j = hash.get(presum - s);
                maxSize = Math.abs(i - j) + 1 ;
            }
        }

        return maxSize ;
    }
}
