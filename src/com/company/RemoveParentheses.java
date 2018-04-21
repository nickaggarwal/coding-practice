package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class RemoveParentheses {

    public static void main(String args[]) {
        String s = "(j))(" ;
        List<String> results = removeInvalidParentheses(s);
        System.out.println(results);
    }

    public static List<String> removeInvalidParentheses(String s) {

        List<String> results =  new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        boolean foundLevel = false;
        queue.offer(s);
        visited.add(s);
        while(!queue.isEmpty()){

            String cur = queue.poll();
            if(isValid(cur)){
                results.add(cur);
                foundLevel=true;
            }
            if(foundLevel) continue;
            for(int i=0; i < cur.length(); i++){
                if (!isParenthesis(cur.charAt(i)))
                    continue;
                String temp = cur.substring(0, i) + cur.substring(i+1);
                if(!visited.contains(temp)) {
                    queue.offer(temp);
                    visited.add(temp);
                }
            }

        }
        return results;
    }

    public static boolean isParenthesis(char c)
    {
        return ((c == '(') || (c == ')'));
    }

    public static boolean isValid(String s) {

        int cnt  = 0 ;
        for(int i=0; i < s.length() ; i++ ) {
            if( s.charAt(i) == '(' )
                cnt++ ;
            if( s.charAt(i) == ')' )
                cnt-- ;
            if (cnt < 0 )
                return false;
        }
        if(cnt == 0)
            return true ;
        return false ;
    }


}
