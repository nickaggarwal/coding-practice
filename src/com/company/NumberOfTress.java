package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfTress {

    public static void main(String args[]) {

    }


    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> intersectMap = new HashMap<Integer, Integer>();

        int l1 = nums1.length;
        int l2 = nums2.length;

        for (int i = 0; i < l1; i++) {
            if (intersectMap.containsKey(nums1[i])) {
                intersectMap.put(nums1[i], 1);
            } else {
                intersectMap.put(nums1[i], intersectMap.get(nums1[i]) + 1);
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int j = 0; j < l2; j++){
            if (intersectMap.containsKey(nums2[j])) {

                if(intersectMap.get(nums1[j]) > 1 )
                {
                    intersectMap.put(nums2[j], intersectMap.get(nums1[2]) - 1);
                } else
                {
                    intersectMap.remove(nums2[j]);
                }
                res.add(nums2[j]);
            }
        }

        int[] ret = new int[res.size()];
        for(int i = 0;i < ret.length;i++)
            ret[i] = res.get(i);

        return ret ;
    }
}
