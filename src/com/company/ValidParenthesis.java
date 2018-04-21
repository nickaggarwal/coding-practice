package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        // write your code here
        int n = 10 ;
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        Map<Character,Character> charMap = new HashMap<>();
        charMap.put('{','}');
        charMap.put('(',')');
        charMap.put('[',']');
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < s.length() ; i++ )
        {
            if( "{([".indexOf(s.charAt(i)) != -1 )
                stack.push(s.charAt(i));
            if( "})]".indexOf(s.charAt(i)) != -1)
            {
                if(stack.empty() || charMap.get(stack.peek()) != s.charAt(i))
                    return false ;
                stack.pop();
            }
        }

        if(stack.empty())
            return true ;
        return false ;
    }


}
