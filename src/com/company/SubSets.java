package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class SubSets {
    public static void main(String args[]) {
        int[] arr = {1,2,3} ;
        System.out.println(subsets(arr));
    }


    public static List<List<Integer>> subsets(int[] nums) {
        List< List <Integer> > results = new ArrayList<>();

        if(nums.length == 0 )
            return results ;

        for(int i=0 ; i < nums.length ; i++)
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums[i]);
            results.add(new ArrayList<Integer>(temp)) ;
            subsetsUtil(nums, i+1, temp, results) ;
            temp.remove(temp.size()-1);
        }
        return results ;
    }

    public static void subsetsUtil(int[] nums, int start,  List<Integer> temp, List< List <Integer> > results)
    {
        if( nums.length == start )
            return;

        for(int i=start; i<nums.length ; i++)
        {
            temp.add(nums[i]);
            results.add(new ArrayList<>(temp)) ;
            subsetsUtil(nums, i+1, temp, results) ;
            temp.remove(temp.size()-1);
        }

        return;
    }
}
