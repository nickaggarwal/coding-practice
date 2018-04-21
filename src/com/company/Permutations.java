package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public static void main(String args[]) {

        int[] nums = {1,1,2} ;
        List<List<Integer> > results = permute(nums);
        System.out.println(results.toString());
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer> > results = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(new ArrayList<>(), used ,nums, results);
        return results;
    }

    public static void backtrack(List<Integer> current, boolean[] used, int[] nums, List<List<Integer>> results){
        if (current.size() == nums.length){
            if(!results.contains(current))
                results.add(new ArrayList<>(current));
        }
        else {
            for(int i=0; i <nums.length; i++ ){
                if( !used[i]) {
                    used[i] = true ;
                    current.add(nums[i]);
                    backtrack(current, used, nums, results);
                    current.remove(current.size() -1 );
                    used[i] = false ;
                }
            }
        }
    }

}
