package com.company;

public class LongestPalingdromicSequence {

    public static void main(String[] args) {
        // write your code here
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
        if(s.length() == 0)
            return "";
        boolean[][] dp = new boolean[s.length()+1][s.length()+1] ;
        int max_len = 0 ;
        String maxPalindrome = "" ;
        for(int i=0; i < s.length() ; i++ ){
            dp[i][i] = true;
            s.substring(i);
        }
        for( int l=2; l<= s.length() ; l++){
            for( int i = 0 ; i < s.length() + 1 - l ; i++){
                int j = l + i - 1 ;

                if( j - i == 1 && s.charAt(i) == s.charAt(j))
                    dp[i][j] = true;

                if( s.charAt(i) == s.charAt(j) && dp[i+1][j-1]) {
                    dp[i][j] = true;
                }

                if( (j-i)+1 > max_len && dp[i][j]) {
                    max_len = (j - i) + 1;
                    maxPalindrome = s.substring(i, j+1);
                }

            }
        }
        return maxPalindrome ;
    }
}
