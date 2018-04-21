package com.company;

import java.util.Stack;

public class CelebrityProblem {

    public static boolean knows(int a, int b){
        return true ;
    }

    public static void main(String[] args) {
        // write your code here
        int n = 10 ;
        System.out.println(findCelebrity(n));
    }

    static int findCelebrity(int n) {

        int start = 0 , end = n-1 ;
        while(start < end)
        {
            if(knows(start, end)) {
                start++;
            }
            else {
                end-- ;
            }
        }
        int i = start ;
        boolean is_celeb = true;
        //Everyone Knows him
        for(int j =0 ; j< n ; j++  )
        {
            if(j!=i && !knows(j, i))
            {
                is_celeb = false;
            }
        }

        //he Knows noone
        for(int j =0 ; j< n ; j++  )
        {
            if(j!=i && knows(i, j))
            {
                is_celeb = false;
            }
        }

        return i ;
    }
}
