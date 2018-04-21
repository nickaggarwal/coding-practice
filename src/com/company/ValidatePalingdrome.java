package com.company;

public class ValidatePalingdrome {

    public static void main(String[] args) {
        // write your code here
        int n = 10 ;
        System.out.println(validPalindrome("deeee"));
    }

    public static boolean validPalindrome(String s) {
        return valPalAll(s , 0 , s.length() -1 );
    }

    public static boolean valPal(String s, int start, int end)
    {
        while( start < end ){
            if( s.charAt(start) != s.charAt(end) ){
                return false ;
            }
            start++ ;
            end-- ;
        }

        return true ;
    }

    public static boolean valPalAll(String s, int start, int end)
    {
        while( start < end ) {
            if (s.charAt(start) != s.charAt(end)) {
                return valPal(s, start + 1, end) && valPal(s, start, end - 1);
            }

            start++;
            end--;
        }
        return true ;
    }
}
