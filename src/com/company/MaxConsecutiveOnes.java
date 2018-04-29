package com.company;

public class MaxConsecutiveOnes {

    public static void main(String args[]) {
    }


    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxCount = 0, count=0 , zeroCount =1;
        for( int num : nums){
            if( num == 1 ){
                count++;
                if( maxCount < count ){
                    maxCount = count;
                }
            }
            else {
                if(zeroCount == 0){
                    count = 0;
                    zeroCount = 1 ;
                }
                else {
                    zeroCount = 0 ;
                }
            }
        }
        return maxCount;
    }
}
