package com.company;

import java.util.Stack;

public class TappingRainWatter {

    public static void main(String[] args) {
        // write your code here
        int[] n = {0,1,0,2,1,0,1,3,2,1,2,1} ;
        System.out.println(trap(n));
    }

    public static int trap(int[] height) {

        int count = 0 ;
        int size = height.length;
        int[] maxLeft = new int[size];
        int[] maxRight = new int[size];

        maxLeft[0] = height[0];
        for(int i = 1 ;i < size ; i++ )
            maxLeft[i] = Math.max(maxLeft[i-1], height[i]);

        maxRight[size-1] = height[size-1];
        for(int i = size-2 ;i >= 0 ; i-- )
            maxRight[i] = Math.max(height[i], maxRight[i+1]);

        for(int i = 1 ; i < height.length - 1 ;i ++){
            count += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        return count;
    }


}
