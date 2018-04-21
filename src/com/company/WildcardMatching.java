package com.company;

import java.util.Arrays;

public class WildcardMatching {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isMatch("a", "a*"));

    }
    public static boolean isMatch(String s, String p) {

        if(p.length() == 0 && s.length() ==0 )
            return true;

        boolean[][] lookup = new boolean[s.length()+1][p.length()+1];

        for(int i = 0; i < s.length() ; i++)
            Arrays.fill(lookup[i], false);

        lookup[0][0] = true ;
        for (int j=1; j <= p.length() ; j++ )
            if (p.charAt(j-1) == '*')
                lookup[0][j] = lookup[0][j-1];

        for (int i=1; i <= s.length() ; i++ ){
            for (int j=1; j <= p.length() ; j++ ){
                if (p.charAt(j-1) == '*'){
                    lookup[i][j] = lookup[i-1][j] || lookup[i][j-1];
                }
                else if(p.charAt(j-1)== '?' || s.charAt(i-1) == p.charAt(j-1)){
                    lookup[i][j] = lookup[i-1][j-1];
                }
                else {
                    lookup[i][j] = false ;
                }
            }
        }

        return lookup[s.length()][p.length()];
    }
}
