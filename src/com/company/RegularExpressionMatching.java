package com.company;

import java.util.List;

public class RegularExpressionMatching {

    public static void main(String args[]) {
        System.out.println(isMatch("aa", "a*"));
    }

    public static boolean isMatch(String s, String p) {

        if( p.length() == 0 ){
            return s.length() == 0 ;
        }

        //Case when P == 1
        if( p.length() == 1 ){
            if (s.length() == 0 )
                return false ;
            else if (p.charAt(0) != '.' && p.charAt(0) != s.charAt(0) )
                return false;
            else
                return isMatch(s.substring(1), p.substring(1));

        }
        if (p.charAt(1) != '*'){

            if(s.length() == 0 )
                return false;
            else if(s.charAt(0) != p.charAt(0) && p.charAt(0) != '.' ){
                return false;
            }
            else
                return isMatch(s.substring(1), p.substring(1));
        } else {
            if (isMatch(s, p.substring(2)))
                return true;
            int i=0 ;
            while ( i< s.length() && ( p.charAt(0) == s.charAt(i) || p.charAt(i) == '.')){
                if (isMatch(s.substring(i+1), p.substring(2)))
                    return true;
                i++;
            }
            return false;

        }
    }
}
