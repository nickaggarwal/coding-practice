package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithKDistinctChar {

    public static void main(String args[]) {

    }

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> hash = new HashMap<>();
        int i=0, start=0 ,max=0;
        while(i<s.length()){
            char c = s.charAt(i);
            if(!hash.containsKey(c)){
                hash.put(c, 1);
            } else {
                hash.put(c, hash.get(c));
            }
            if(hash.size() > k){
                max = Math.max(i-start, max);
                while (hash.size() > k) {
                    char t = s.charAt(start);
                    int cnt = hash.get(t);
                    if(cnt > 1){
                        hash.put(t, cnt-1);
                    }
                    else {
                        hash.remove(t);
                    }
                    start++;
                }
            }
        }
        return max;
    }


}
